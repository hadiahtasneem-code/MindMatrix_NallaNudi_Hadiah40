package com.example.nelanudi.ui.screens.home

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nelanudi.data.local.entity.Term
import com.example.nelanudi.ui.screens.detail.DetailScreen
import com.example.nelanudi.ui.theme.*
import com.example.nelanudi.utils.TTSManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(vm: HomeViewModel = viewModel()) {
    val state by vm.uiState.collectAsStateWithLifecycle()
    val wordOfDay by vm.wordOfDay.collectAsStateWithLifecycle()
    var selectedTermId by remember { mutableStateOf<Int?>(null) }
    
    val selectedTerm = remember(selectedTermId, state.results, wordOfDay) {
        if (selectedTermId == null) null
        else state.results.find { it.id == selectedTermId } ?: wordOfDay?.takeIf { it.id == selectedTermId }
    }
    
    val context = LocalContext.current
    val tts = remember { TTSManager(context) }
    
    DisposableEffect(Unit) {
        onDispose {
            tts.shutdown()
        }
    }

    val isDark = isSystemInDarkTheme()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(top = 48.dp, bottom = 24.dp)
    ) {
        // Header
        item(contentType = "header") {
            HomeHeader()
        }

        // Search Bar
        item(contentType = "search") {
            SearchBar(query = state.query, onQueryChange = { vm.updateQuery(it) })
        }

        // Search suggestions
        if (state.query.isNotBlank()) {
            item(contentType = "suggestions") {
                SearchSuggestions(results = state.results, onSelect = { selectedTermId = it.id })
            }
        }

        // Word of the Day
        item(contentType = "wotd") {
            wordOfDay?.let { term ->
                WotdCard(term = term, onClick = { selectedTermId = term.id })
            }
        }

        // Subject Filter
        item(contentType = "filter") {
            SubjectFilterSection(
                selectedSubject = state.selectedSubject,
                isDark = isDark,
                onSubjectSelect = { vm.updateSubject(it) }
            )
        }

        // List Header
        item(contentType = "list_header") {
            ListHeader(subject = state.selectedSubject, count = state.results.size)
        }

        // Terms List
        items(
            items = state.results,
            key = { it.id },
            contentType = { "term_item" }
        ) { term ->
            TermListItem(term = term, isDark = isDark, onClick = { selectedTermId = term.id })
        }
    }

    if (selectedTerm != null) {
        Dialog(
            onDismissRequest = { selectedTermId = null },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                DetailScreen(
                    term = selectedTerm,
                    onBack = { selectedTermId = null },
                    onToggleSave = { vm.toggleSaved(it) }
                )
            }
        }
    }
}

@Composable
private fun HomeHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(PrimaryDeep),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Default.AutoStories, contentDescription = null, tint = Color.White, modifier = Modifier.size(30.dp))
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "Nalla Nudi",
                    style = MaterialTheme.typography.displayLarge.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 28.sp
                    )
                )
                Text(
                    text = "Bridge Dictionary",
                    style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f))
                )
            }
        }
        IconButton(
            onClick = { /* TODO: Open bookmarks or navigate to Saved */ },
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)
                .background(Color(0xFFE0F7FA))
        ) {
            Icon(Icons.Default.Bookmark, contentDescription = null, tint = PrimaryDeep)
        }
    }
}

@Composable
private fun SearchBar(query: String, onQueryChange: (String) -> Unit) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(MaterialTheme.colorScheme.surface),
        placeholder = { Text("Search English term...", color = MaterialTheme.colorScheme.onSurfaceVariant) },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant) },
        shape = RoundedCornerShape(24.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = PrimaryDeep,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        singleLine = true,
        textStyle = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSurface)
    )
}

@Composable
private fun SearchSuggestions(results: List<Term>, onSelect: (Term) -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(12.dp))
        .background(MaterialTheme.colorScheme.surface)
        .padding(8.dp)) {
        val suggestions = remember(results) { results.take(5) }
        suggestions.forEach { s ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable { onSelect(s) }
                .padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = s.englishWord, style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onSurface))
                    Text(text = s.kannadaMeaning, style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)))
                }
                Text(text = s.subject, style = MaterialTheme.typography.labelSmall.copy(color = PrimaryDeep))
            }
            HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
        }
    }
}

@Composable
private fun SubjectFilterSection(selectedSubject: String, isDark: Boolean, onSubjectSelect: (String) -> Unit) {
    val filters = remember(isDark) {
        listOf(
            FilterItem("All", Icons.Default.GridView, PrimaryDeep, Color(0xFFF0F4F8)),
            FilterItem("Science", Icons.Default.Science, ColorScience, if (isDark) ColorScience.copy(alpha = 0.2f) else ColorScienceLight),
            FilterItem("Math", Icons.Default.Calculate, ColorMath, if (isDark) ColorMath.copy(alpha = 0.2f) else ColorMathLight),
            FilterItem("Commerce", Icons.Default.TrendingUp, ColorCommerce, if (isDark) ColorCommerce.copy(alpha = 0.2f) else ColorCommerceLight)
        )
    }
    Column {
        Text(
            text = "Filter by Subject",
            style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onBackground)
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            items(filters, key = { it.label }) { filter ->
                SubjectChip(
                    filter = filter,
                    isSelected = selectedSubject == filter.label,
                    onClick = { onSubjectSelect(filter.label) }
                )
            }
        }
    }
}

@Composable
private fun ListHeader(subject: String, count: Int) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$subject Words",
            style = MaterialTheme.typography.headlineMedium.copy(color = MaterialTheme.colorScheme.onBackground)
        )
        Text(
            text = "$count words",
            style = MaterialTheme.typography.labelLarge.copy(color = PrimaryDeep)
        )
    }
}

data class FilterItem(val label: String, val icon: androidx.compose.ui.graphics.vector.ImageVector, val color: Color, val bgColor: Color)

@Composable
fun SubjectChip(filter: FilterItem, isSelected: Boolean, onClick: () -> Unit) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(24.dp),
        color = if (isSelected) filter.color else filter.bgColor,
        modifier = Modifier.height(48.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                filter.icon,
                contentDescription = null,
                modifier = Modifier.size(18.dp),
                tint = if (isSelected) Color.White else filter.color
            )
            Text(
                text = filter.label,
                style = MaterialTheme.typography.labelLarge.copy(
                    color = if (isSelected) Color.White else filter.color,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}

@Composable
fun WotdCard(term: Term, onClick: () -> Unit) {
    val infiniteTransition = rememberInfiniteTransition(label = "wotd_shimmer")
    val shimmerAlpha by infiniteTransition.animateFloat(
        initialValue = 0.6f,
        targetValue = 1.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "shimmer_alpha"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            WotdGradientStart.copy(alpha = shimmerAlpha),
                            WotdGradientMiddle,
                            WotdGradientEnd
                        )
                    )
                )
                .padding(24.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Surface(
                        color = Color.White.copy(alpha = 0.3f),
                        shape = RoundedCornerShape(100)
                    ) {
                        Text(
                            "☀️ Word of the Day",
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelSmall.copy(color = Color.White)
                        )
                    }
                    Surface(
                        color = Color.White.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(100)
                    ) {
                        Text(
                            term.subject,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelSmall.copy(color = Color.White)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = term.englishWord,
                    style = MaterialTheme.typography.displayMedium.copy(color = Color.White, fontWeight = FontWeight.Bold)
                )
                Text(
                    text = term.kannadaMeaning,
                    style = MaterialTheme.typography.headlineSmall.copy(color = Color.White.copy(alpha = 0.9f))
                )
                Spacer(modifier = Modifier.weight(1f))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "Learn more",
                        style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                }
            }
        }
    }
}

@Composable
fun TermListItem(term: Term, isDark: Boolean, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        color = MaterialTheme.colorScheme.surface,
        shadowElevation = 1.dp
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val bgColor = remember(term.subject, isDark) {
                when(term.subject) {
                    "Science" -> if (isDark) ColorScience.copy(alpha = 0.2f) else ColorScienceLight
                    "Math" -> if (isDark) ColorMath.copy(alpha = 0.2f) else ColorMathLight
                    else -> if (isDark) ColorCommerce.copy(alpha = 0.2f) else ColorCommerceLight
                }
            }
            val tintColor = remember(term.subject) {
                when(term.subject) {
                    "Science" -> ColorScience
                    "Math" -> ColorMath
                    else -> ColorCommerce
                }
            }
            
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(bgColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    when(term.subject) {
                        "Science" -> Icons.Default.Science
                        "Math" -> Icons.Default.Calculate
                        else -> Icons.AutoMirrored.Filled.TrendingUp
                    },
                    contentDescription = null,
                    tint = tintColor
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = term.englishWord, style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onSurface))
                Text(text = term.kannadaMeaning, style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)))
            }
            Surface(
                color = bgColor,
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    term.subject,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                    style = MaterialTheme.typography.labelSmall.copy(color = tintColor)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(16.dp))
        }
    }
}
