package com.example.nelanudi.data.local.dao

import com.example.nelanudi.data.local.entity.Term
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TermDao {

    @Query("SELECT * FROM terms")
    fun getAllTerms(): Flow<List<Term>>

    @Query("SELECT * FROM terms WHERE englishWord LIKE '%' || :query || '%' OR kannadaMeaning LIKE '%' || :query || '%'")
    fun searchTerms(query: String): Flow<List<Term>>

    @Query("SELECT * FROM terms WHERE isSaved = 1")
    fun getSavedTerms(): Flow<List<Term>>

    @Query("SELECT * FROM terms WHERE subject = :subject")
    fun getTermsBySubject(subject: String): Flow<List<Term>>

    @Query("SELECT * FROM terms WHERE subject = :subject AND (englishWord LIKE '%' || :query || '%' OR kannadaMeaning LIKE '%' || :query || '%')")
    fun searchTermsBySubject(query: String, subject: String): Flow<List<Term>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(terms: List<Term>)

    @Update
    suspend fun updateTerm(term: Term)

    @Query("SELECT * FROM terms ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomTerm(): Term?

    @Query("SELECT * FROM terms ORDER BY viewCount DESC LIMIT 10")
    fun getRecentlyViewed(): Flow<List<Term>>

    @Query("DELETE FROM terms")
    suspend fun clearAll()

    @Query("SELECT COUNT(*) FROM terms")
    suspend fun getCount(): Int

    @Query("SELECT EXISTS(SELECT 1 FROM terms WHERE englishWord = :word LIMIT 1)")
    suspend fun exists(word: String): Boolean
}
