package com.example.nelanudi.ui.screens.saved

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nelanudi.data.local.entity.Term
import com.example.nelanudi.ui.screens.home.HomeViewModel
import com.example.nelanudi.ui.screens.detail.DetailScreen
import com.example.nelanudi.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SavedScreen(
    vm: HomeViewModel = viewModel(),
    onPractice: () -> Unit = {}
) {
    val state by vm.uiState.collectAsStateWithLifecycle()
    var selectedTerm by remember { mutableStateOf<Term?>(null) }
    val savedTerms = remember(state.results) { state.results.filter { it.isSaved } }
    val isDark = isSystemInDarkTheme()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "My List",
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = PrimaryDeep
                        )
                    )
                },
                actions = {
                    if (savedTerms.isNotEmpty()) {
                        FilledTonalButton(
                            onClick = onPractice,
                            modifier = Modifier.padding(end = 16.dp),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = PrimaryDeep.copy(alpha = 0.1f),
                                contentColor = PrimaryDeep
                            )
                        ) {
                            Icon(Icons.Default.PlayArrow, contentDescription = null)
                            Spacer(Modifier.width(4.dp))
                            Text("Practice")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(padding)
        ) {
            if (savedTerms.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Default.BookmarkBorder,
                            contentDescription = null,
                            modifier = Modifier.size(80.dp),
                            tint = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
                        )
                        Spacer(Modifier.height(16.dp))
                        Text(
                            "No words saved yet",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                        Text(
                            "Tap the bookmark icon on any word to save it here.",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.outline.copy(alpha = 0.7f),
                            modifier = Modifier.padding(horizontal = 32.dp),
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(
                        items = savedTerms, 
                        key = { it.id },
                        contentType = { "saved_item" }
                    ) { term ->
                        SavedTermItem(
                            term = term,
                            isDark = isDark,
                            onClick = { selectedTerm = term },
                            onUnsave = { vm.toggleSaved(term) }
                        )
                    }
                }
            }
        }
    }

    if (selectedTerm != null) {
        Dialog(
            onDismissRequest = { selectedTerm = null },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                DetailScreen(
                    term = selectedTerm!!,
                    onBack = { selectedTerm = null },
                    onToggleSave = { vm.toggleSaved(it) }
                )
            }
        }
    }
}

@Composable
fun SavedTermItem(
    term: Term,
    isDark: Boolean,
    onClick: () -> Unit,
    onUnsave: () -> Unit
) {
    val subjectColor = remember(term.subject) {
        when (term.subject) {
            "Science" -> ColorScience
            "Math" -> ColorMath
            else -> ColorCommerce
        }
    }
    
    val subjectBg = remember(term.subject, isDark) {
        when (term.subject) {
            "Science" -> if (isDark) ColorScience.copy(alpha = 0.2f) else ColorScienceLight
            "Math" -> if (isDark) ColorMath.copy(alpha = 0.2f) else ColorMathLight
            else -> if (isDark) ColorCommerce.copy(alpha = 0.2f) else ColorCommerceLight
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(subjectBg),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    when (term.subject) {
                        "Science" -> Icons.Default.Science
                        "Math" -> Icons.Default.Calculate
                        else -> Icons.AutoMirrored.Filled.TrendingUp
                    },
                    contentDescription = null,
                    tint = subjectColor,
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(Modifier.width(16.dp))

            // Text
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = term.englishWord,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Text(
                    text = term.kannadaMeaning,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }

            // Unsave Action
            IconButton(onClick = onUnsave) {
                Icon(
                    Icons.Default.Bookmark,
                    contentDescription = "Unsave",
                    tint = PrimaryDeep,
                    modifier = Modifier.size(22.dp)
                )
            }

            Icon(
                Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.outline,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}
