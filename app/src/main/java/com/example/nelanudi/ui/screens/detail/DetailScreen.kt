package com.example.nelanudi.ui.screens.detail

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.automirrored.filled.TrendingUp
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
import com.example.nelanudi.data.local.entity.Term
import com.example.nelanudi.ui.theme.*
import com.example.nelanudi.utils.TTSManager
import kotlinx.coroutines.delay

@Composable
fun DetailScreen(
    term: Term,
    onBack: () -> Unit = {},
    onToggleSave: (Term) -> Unit = {}
) {
    val context = LocalContext.current
    val tts = remember { TTSManager(context) }
    
    DisposableEffect(Unit) {
        onDispose {
            tts.shutdown()
        }
    }
    val scrollState = rememberScrollState()
    var isSpeaking by remember { mutableStateOf(false) }
    var speechCompleted by remember { mutableStateOf(false) }

    val speakColor by animateColorAsState(
        targetValue = if (isSpeaking) ColorSuccess else PrimaryDeep,
        animationSpec = tween(300),
        label = "speak_color"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(20.dp)
    ) {
        // Toolbar
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { /* Search */ }) {
                    Icon(Icons.Default.Search, contentDescription = null, tint = PrimaryDeep)
                }
                IconButton(onClick = { onToggleSave(term) }) {
                    Icon(
                        if (term.isSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = null,
                        tint = PrimaryDeep
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Main Header Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(modifier = Modifier.padding(24.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(
                                when (term.subject) {
                                    "Science" -> if (isSystemInDarkTheme()) ColorScience.copy(alpha = 0.2f) else ColorScienceLight
                                    "Math" -> if (isSystemInDarkTheme()) ColorMath.copy(alpha = 0.2f) else ColorMathLight
                                    else -> if (isSystemInDarkTheme()) ColorCommerce.copy(alpha = 0.2f) else ColorCommerceLight
                                }
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            when (term.subject) {
                                "Science" -> Icons.Default.Science
                                "Math" -> Icons.Default.Calculate
                                else -> Icons.AutoMirrored.Filled.TrendingUp
                            },
                            contentDescription = null,
                            tint = when (term.subject) {
                                "Science" -> ColorScience
                                "Math" -> ColorMath
                                else -> ColorCommerce
                            }
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = term.subject,
                        style = MaterialTheme.typography.labelLarge.copy(
                            color = when (term.subject) {
                                "Science" -> ColorScience
                                "Math" -> ColorMath
                                else -> ColorCommerce
                            }
                        )
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = term.englishWord,
                    style = MaterialTheme.typography.displayLarge.copy(color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Bold)
                )
                if (term.pronunciation.isNotEmpty()) {
                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "[ ${term.pronunciation} ]",
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Pronunciation Button
        Button(
            onClick = {
                isSpeaking = true
                tts.speak(term.englishWord)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(0.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.horizontalGradient(
                            colors = if (isSpeaking) listOf(ColorSuccess, Color(0xFF1B5E20))
                            else listOf(PrimaryDeep, Color(0xFF42A5F5))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        modifier = Modifier.size(32.dp),
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.2f)
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.VolumeUp,
                            contentDescription = null,
                            modifier = Modifier.padding(6.dp),
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = if (isSpeaking) "Speaking..." else "Hear Pronunciation",
                            style = MaterialTheme.typography.labelLarge.copy(color = Color.White)
                        )
                        Text(
                            text = term.englishWord,
                            style = MaterialTheme.typography.bodySmall.copy(color = Color.White.copy(alpha = 0.7f))
                        )
                    }
                }
            }
        }

        LaunchedEffect(isSpeaking) {
            if (isSpeaking) {
                delay(2000)
                isSpeaking = false
                speechCompleted = true
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Kannada Meaning Card
        InfoCard(
            title = "Kannada Meaning",
            icon = Icons.Default.Translate,
            content = term.kannadaMeaning,
            contentColor = if (speechCompleted) ColorSuccess else MaterialTheme.colorScheme.onSurface
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Simple Explanation Card (EN + KN)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(24.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Lightbulb, contentDescription = null, tint = PrimaryDeep, modifier = Modifier.size(20.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Simple Explanation", style = MaterialTheme.typography.labelLarge.copy(color = PrimaryDeep))
                }
                Spacer(modifier = Modifier.height(16.dp))
                
                // English Explanation
                Text(
                    text = term.simpleExplanation,
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Medium)
                )
                
                if (term.kannadaDefinition.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    // Kannada Explanation
                    Text(
                        text = term.kannadaDefinition,
                        style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Bold)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Example Card (EN + KN)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(24.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.FormatQuote, contentDescription = null, tint = PrimarySky, modifier = Modifier.size(20.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Usage Example", style = MaterialTheme.typography.labelLarge.copy(color = PrimarySky))
                }
                Spacer(modifier = Modifier.height(16.dp))
                
                // English Example
                Surface(
                    color = if (isSystemInDarkTheme()) ColorScience.copy(alpha = 0.1f) else Color(0xFFE1F5FE),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Surface(color = PrimaryDeep, shape = RoundedCornerShape(4.dp)) {
                            Text("EN", modifier = Modifier.padding(horizontal = 4.dp), style = MaterialTheme.typography.labelSmall.copy(color = Color.White, fontSize = 10.sp))
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(term.exampleUsage, style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface))
                    }
                }
                
                // Kannada Example
                val kex = term.kannadaExample
                if (kex.isNotBlank()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Surface(
                        color = if (isSystemInDarkTheme()) ColorMath.copy(alpha = 0.1f) else Color(0xFFF3E5F5),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Surface(color = PrimarySky, shape = RoundedCornerShape(4.dp)) {
                                Text("ಕ", modifier = Modifier.padding(horizontal = 4.dp), style = MaterialTheme.typography.labelSmall.copy(color = Color.White, fontSize = 10.sp))
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(kex, style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.Bold))
                        }
                    }
                }
            }
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Button(
            onClick = { onToggleSave(term) },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(28.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryDeep)
        ) {
            Icon(if (term.isSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(if (term.isSaved) "Remove from My List" else "Add to My List")
        }
    }
}

@Composable
fun InfoCard(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector, content: String, contentColor: Color = MaterialTheme.colorScheme.onSurface) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(24.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, contentDescription = null, tint = PrimaryDeep, modifier = Modifier.size(20.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(title, style = MaterialTheme.typography.labelLarge.copy(color = PrimaryDeep))
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = content,
                style = MaterialTheme.typography.headlineSmall.copy(color = contentColor, fontWeight = FontWeight.Bold)
            )
        }
    }
}
