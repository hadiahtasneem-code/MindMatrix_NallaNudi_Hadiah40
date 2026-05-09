package com.example.nelanudi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.nelanudi.ui.screens.home.HomeScreen
import com.example.nelanudi.ui.screens.saved.SavedScreen
import com.example.nelanudi.ui.screens.quiz.QuizScreen
import com.example.nelanudi.ui.screens.splash.SplashScreen
import com.example.nelanudi.ui.screens.settings.SettingsScreen
import com.example.nelanudi.data.prefs.PreferencesManager
import com.example.nelanudi.ui.theme.NallaNudiTheme
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.nelanudi.work.RevisionReminderWorker
import java.util.concurrent.TimeUnit

/**
 * The main entry point of the application.
 * This activity sets up the Compose UI and handles edge-to-edge display.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable edge-to-edge display
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            var showSplash by remember { mutableStateOf(value = true) }
            // read persisted theme and allow toggling
            var darkTheme by remember { mutableStateOf(PreferencesManager.isDark(this)) }

            NallaNudiTheme(darkTheme = darkTheme) {
                if (showSplash) {
                    SplashScreen { showSplash = false }
                } else {
                    MainScreen(
                        darkTheme = darkTheme,
                        onToggleTheme = { v ->
                            darkTheme = v
                            PreferencesManager.setDark(this, v)
                        }
                    )
                }
            }
        }
        // Schedule daily reminders (one per day). Use a unique periodic work so duplicates are avoided.
        try {
            val workRequest = PeriodicWorkRequestBuilder<RevisionReminderWorker>(1, TimeUnit.DAYS).build()
            WorkManager.getInstance(this).enqueueUniquePeriodicWork(
                "nallanudi_revision_reminder",
                ExistingPeriodicWorkPolicy.KEEP,
                workRequest
            )
        } catch (_: Exception) {
            // ignore scheduling errors at runtime
        }
    }
}

/**
 * The root Composable for the application's main UI.
 * It manages the bottom navigation and switches between different screens:
 * - Home: Glossary and search
 * - Saved: User's bookmarked terms
 * - Quiz: Learning and practice games
 */
@Composable
fun MainScreen(darkTheme: Boolean = false, onToggleTheme: (Boolean) -> Unit = {}) {
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 0.dp
            ) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(Icons.Default.GridView, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(Icons.Default.Bookmark, contentDescription = "Saved") },
                    label = { Text("Saved") }
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(Icons.Default.Psychology, contentDescription = "Quiz") },
                    label = { Text("Quiz") }
                )
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = { Icon(Icons.Default.Settings, contentDescription = "Settings") },
                    label = { Text("Settings") }
                )
            }
        }
    ) { padding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            color = MaterialTheme.colorScheme.background
        ) {
            when (selectedTab) {
                0 -> HomeScreen()
                1 -> SavedScreen(onPractice = { selectedTab = 2 })
                2 -> QuizScreen(onBack = { selectedTab = 0 })
                3 -> SettingsScreen(darkTheme = darkTheme, onToggleTheme = onToggleTheme)
            }
        }
    }
}
