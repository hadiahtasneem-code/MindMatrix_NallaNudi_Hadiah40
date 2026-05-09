package com.example.nelanudi.ui.screens.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.nelanudi.data.local.database.AppDatabase
import com.example.nelanudi.data.local.entity.Term
import com.example.nelanudi.data.repository.TermRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import com.example.nelanudi.data.prefs.PreferencesManager
import java.io.InputStreamReader

data class HomeUiState(
    val query: String = "",
    val selectedSubject: String = "All",
    val results: List<Term> = emptyList(),
    val recent: List<Term> = emptyList(),
    val wordOfDay: Term? = null
)

class HomeViewModel(app: Application) : AndroidViewModel(app) {
    private val repo = TermRepository(
        AppDatabase.getInstance(app).termDao()
    )

    private val _query = MutableStateFlow("")
    private val _subject = MutableStateFlow("All")
    private val _wordOfDay = MutableStateFlow<Term?>(null)

    @OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
    private val _results = combine(
        _query.debounce(250),
        _subject
    ) { q, s -> q to s }
        .distinctUntilChanged()
        .flatMapLatest { (q, s) ->
            when {
                q.isEmpty() && s == "All" -> repo.getAll()
                q.isEmpty() -> repo.getBySubject(s)
                s == "All" -> repo.searchAny(q)
                else -> repo.searchBySubject(q, s)
            }
        }
        .distinctUntilChanged()
        .onStart { emit(emptyList()) }

    private val _recent = repo.getRecentlyViewed()
        .distinctUntilChanged()
        .onStart { emit(emptyList()) }

    val uiState: StateFlow<HomeUiState> = combine(
        _query,
        _subject,
        _results,
        _recent,
        _wordOfDay
    ) { q, s, res, rec, wod ->
        HomeUiState(q, s, res, rec, wod)
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        HomeUiState()
    )

    val wordOfDay: StateFlow<Term?> = _wordOfDay

    init {
        viewModelScope.launch {
            // Seed DB if it's the first run or if data is missing
            val existing = repo.getAll().first()
            val count = existing.size
            val isFullyUpdated = existing.any { it.englishWord == "Dependent Events" }
            
            // Re-seed if data is missing or if the new 600-word list isn't fully loaded
            if (count < 600 || !isFullyUpdated) {
                // 1. Remember which technical words the user has already saved
                val savedWords = existing.filter { it.isSaved }.map { it.englishWord }.toSet()

                repo.clearAll()
                
                // 2. Load the fresh 600-word list from PreloadedTerms
                val preloaded = com.example.nelanudi.data.local.database.PreloadedTerms.get()
                
                // 3. Restore the 'saved' status for those words in the new list
                val listToInsert = preloaded.map { term ->
                    if (savedWords.contains(term.englishWord)) {
                        term.copy(isSaved = true)
                    } else {
                        term
                    }
                }
                
                repo.insertAll(listToInsert)
            }

            loadWordOfDay()
        }
    }

    fun updateQuery(q: String) {
        _query.value = q
    }

    fun updateSubject(s: String) {
        _subject.value = s
    }

    fun loadWordOfDay() {
        viewModelScope.launch {
            val t = repo.random()
            _wordOfDay.value = t
        }
    }

    fun toggleSaved(term: Term) {
        viewModelScope.launch {
            repo.updateTerm(term.copy(isSaved = !term.isSaved))
        }
    }

    private fun getTodayIso(): String {
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        return sdf.format(java.util.Date())
    }

    private fun getYesterdayIso(): String {
        val cal = java.util.Calendar.getInstance()
        cal.add(java.util.Calendar.DAY_OF_YEAR, -1)
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        return sdf.format(cal.time)
    }

    fun markPracticed(term: Term, mastered: Boolean) {
        viewModelScope.launch {
            try {
                PreferencesManager.incrementPracticed(getApplication())
                if (mastered) PreferencesManager.incrementMastered(getApplication())

                val newCount = term.viewCount + 1
                repo.updateTerm(term.copy(viewCount = newCount))

                if (!mastered) PreferencesManager.addRevisionId(getApplication(), term.id)

                val today = getTodayIso()
                val lastIso = PreferencesManager.getStreakLastIso(getApplication())
                
                if (lastIso == null) {
                    PreferencesManager.setStreak(getApplication(), 1, today)
                } else if (lastIso != today) {
                    val yesterday = getYesterdayIso()
                    val currentDays = PreferencesManager.getStreakDays(getApplication())
                    if (lastIso == yesterday) {
                        PreferencesManager.setStreak(getApplication(), currentDays + 1, today)
                    } else {
                        PreferencesManager.setStreak(getApplication(), 1, today)
                    }
                }
            } catch (_: Exception) {}
        }
    }
}
