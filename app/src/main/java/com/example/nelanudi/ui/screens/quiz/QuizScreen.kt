package com.example.nelanudi.ui.screens.quiz

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nelanudi.ui.screens.home.HomeViewModel
import com.example.nelanudi.ui.theme.*
import com.example.nelanudi.data.prefs.PreferencesManager

@Composable
fun QuizScreen(vm: HomeViewModel = viewModel(), onBack: () -> Unit = {}) {
    val state by vm.uiState.collectAsStateWithLifecycle()
    var index by remember { mutableIntStateOf(0) }
    var flipped by remember { mutableStateOf(false) }
    var isSessionComplete by remember { mutableStateOf(false) }
    
    val list = state.results.take(10) // Limit to 10 for practice
    
    if (list.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("No terms available for quiz")
        }
        return
    }

    if (isSessionComplete) {
        SessionCompleteScreen(
            total = list.size,
            onRestart = { 
                index = 0
                isSessionComplete = false
                flipped = false
            },
            onBack = { onBack() }
        )
        return
    }

    val term = list.getOrNull(index) ?: return

    val rotation by animateFloatAsState(
        targetValue = if (flipped) 180f else 0f,
        animationSpec = tween(durationMillis = 400),
        label = "card_rotation"
    )

    val density = LocalDensity.current.density

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { onBack() }) {
                Icon(Icons.Default.Close, contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)
            }
            Text(
                text = "Practice",
                style = MaterialTheme.typography.titleLarge.copy(color = MaterialTheme.colorScheme.onBackground)
            )
            Text(
                text = "${index + 1} / ${list.size}",
                style = MaterialTheme.typography.titleMedium.copy(color = PrimaryDeep)
            )
        }

        LinearProgressIndicator(
            progress = { (index + 1).toFloat() / list.size },
            modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
            color = PrimaryDeep,
            trackColor = MaterialTheme.colorScheme.surfaceVariant
        )

        Spacer(modifier = Modifier.height(24.dp))
        
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(modifier = Modifier.size(8.dp), shape = CircleShape, color = ColorSuccess) {}
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("${index} Mastered", style = MaterialTheme.typography.labelSmall.copy(color = ColorSuccess))
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(modifier = Modifier.size(8.dp), shape = CircleShape, color = PrimarySky) {}
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("${(PreferencesManager.getRevisionCount(LocalContext.current))} Need Practice", style = MaterialTheme.typography.labelSmall.copy(color = PrimarySky))
                    }
                }

        Spacer(modifier = Modifier.weight(1f))

        // Flashcard
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(0.8f)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 12f * density
                }
                .clickable { flipped = !flipped }
        ) {
            if (rotation <= 90f) {
                FlashcardFace(
                    text = term.englishWord,
                    subtext = "English Word",
                    bgColor = MaterialTheme.colorScheme.surface,
                    textColor = MaterialTheme.colorScheme.onSurface
                )
            } else {
                // Back side: show Kannada details and explanation
                Card(
                    modifier = Modifier.fillMaxSize().graphicsLayer { rotationY = 180f },
                    shape = RoundedCornerShape(32.dp),
                    colors = CardDefaults.cardColors(containerColor = PrimaryDeep),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(text = term.kannadaMeaning, style = MaterialTheme.typography.headlineMedium.copy(color = Color.White, fontWeight = FontWeight.Bold))
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "Pronunciation: ${term.pronunciation}", style = MaterialTheme.typography.bodyMedium.copy(color = Color.White.copy(alpha = 0.9f)))
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = term.kannadaDefinition, style = MaterialTheme.typography.bodyLarge.copy(color = Color.White))
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(text = "Example: ${term.exampleUsage}", style = MaterialTheme.typography.bodySmall.copy(color = Color.White.copy(alpha = 0.9f)))
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Actions
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { 
                    // Mark mastered and advance
                    vm.markPracticed(term, mastered = true)
                    if (index < list.size - 1) {
                        index++
                        flipped = false
                    } else {
                        isSessionComplete = true
                    }
                },
                modifier = Modifier.weight(1f).height(56.dp),
                shape = RoundedCornerShape(28.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryDeep)
            ) {
                Text("I Know This")
            }
            
            OutlinedButton(
                onClick = { 
                    // Mark as needs practice (not mastered) and advance
                    vm.markPracticed(term, mastered = false)
                    if (index < list.size - 1) {
                        index++
                        flipped = false
                    } else {
                        isSessionComplete = true
                    }
                },
                modifier = Modifier.weight(1f).height(56.dp),
                shape = RoundedCornerShape(28.dp),
                border = ButtonDefaults.outlinedButtonBorder.copy(width = 2.dp)
            ) {
                Text("Next")
            }
        }
    }
}

@Composable
fun FlashcardFace(text: String, subtext: String, bgColor: Color, textColor: Color, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(32.dp),
        colors = CardDefaults.cardColors(containerColor = bgColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = subtext,
                    style = MaterialTheme.typography.labelLarge.copy(color = textColor.copy(alpha = 0.6f))
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = text,
                    style = MaterialTheme.typography.displayMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = textColor
                    )
                )
            }
        }
    }
}

@Composable
fun SessionCompleteScreen(total: Int, onRestart: () -> Unit, onBack: () -> Unit) {
    val ctx = LocalContext.current
    val practiced = PreferencesManager.getPracticed(ctx)
    val mastered = PreferencesManager.getMastered(ctx)
    val scorePercent = if (practiced == 0) 0 else (mastered * 100 / practiced)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(48.dp))
        
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(PrimaryDeep, PrimarySky)
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Default.Celebration, contentDescription = null, tint = Color.White, modifier = Modifier.size(64.dp))
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Session Complete! 🎉",
            style = MaterialTheme.typography.displayMedium.copy(color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "You practiced $total words",
            style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f))
        )

        Spacer(modifier = Modifier.height(48.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            StatCard(label = "Mastered", value = "$mastered", color = ColorSuccess, modifier = Modifier.weight(1f))
            StatCard(label = "Need Practice", value = "${PreferencesManager.getRevisionCount(ctx)}", color = PrimarySky, modifier = Modifier.weight(1f))
            StatCard(label = "Score %", value = "$scorePercent%", color = PrimaryDeep, modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onRestart,
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(28.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryDeep)
        ) {
            Icon(Icons.Default.RestartAlt, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Practice Again")
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(28.dp)
        ) {
            Icon(Icons.Default.List, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Back to List")
        }
    }
}

@Composable
fun StatCard(label: String, value: String, color: Color, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(120.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = color.copy(alpha = 0.1f))
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                when(label) {
                    "Mastered" -> Icons.Default.CheckCircle
                    "Need Practice" -> Icons.Default.History
                    else -> Icons.Default.Star
                },
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(24.dp)
            )
            Text(text = value, style = MaterialTheme.typography.headlineLarge.copy(color = color, fontWeight = FontWeight.Bold))
            Text(text = label, style = MaterialTheme.typography.labelSmall.copy(color = color), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
        }
    }
}
