package com.example.nelanudi.ui.screens.settings

import android.Manifest
import android.app.TimePickerDialog
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.nelanudi.data.prefs.PreferencesManager
import com.example.nelanudi.ui.theme.*
import com.example.nelanudi.utils.NotificationHelper
import coil.compose.AsyncImage
import kotlinx.coroutines.launch
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(darkTheme: Boolean = false, onToggleTheme: (Boolean) -> Unit = {}) {
    val ctx = LocalContext.current
    val scroll = rememberScrollState()
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    // Profile state
    val profile = remember { PreferencesManager.getProfile(ctx) }
    var name by remember { mutableStateOf(profile["name"] ?: "") }
    var bio by remember { mutableStateOf(profile["bio"] ?: "") }
    var goal by remember { mutableStateOf(profile["goal"] ?: "") }
    var imageUri by remember { mutableStateOf(profile["image"]) }

    // Reminder state
    var reminderEnabled by remember { mutableStateOf(PreferencesManager.isReminderEnabled(ctx)) }
    var reminderTime by remember { mutableStateOf(PreferencesManager.getReminderTime(ctx)) }

    var showResetDialog by remember { mutableStateOf(false) }

    val pickLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) imageUri = uri.toString()
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            NotificationHelper.sendRevisionReminder(ctx, PreferencesManager.getRevisionCount(ctx))
        } else {
            scope.launch { snackbarHostState.showSnackbar("Notification permission denied") }
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text("Settings", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    titleContentColor = MaterialTheme.colorScheme.onSurface
                )
            )
        },
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(scroll)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            // Appearance Section
            SettingsSection(title = "Appearance") {
                SettingsRow(
                    icon = if (darkTheme) Icons.Default.DarkMode else Icons.Default.LightMode,
                    label = "Dark Mode",
                    trailing = {
                        Switch(checked = darkTheme, onCheckedChange = { onToggleTheme(it) })
                    }
                )
            }

            // Profile Section
            SettingsSection(title = "Profile") {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.surfaceVariant)
                            .clickable { pickLauncher.launch("image/*") },
                        contentAlignment = Alignment.Center
                    ) {
                        if (imageUri != null && imageUri!!.isNotBlank()) {
                            AsyncImage(
                                model = imageUri,
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            Icon(Icons.Default.Person, contentDescription = null, modifier = Modifier.size(48.dp), tint = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Text("Edit", color = Color.White, fontSize = 12.sp, modifier = Modifier.padding(bottom = 4.dp))
                        }
                    }

                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Name") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = bio,
                        onValueChange = { bio = it },
                        label = { Text("Bio") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = goal,
                        onValueChange = { goal = it },
                        label = { Text("Learning Goal") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )

                    Button(
                        onClick = {
                            PreferencesManager.saveProfile(ctx, name, bio, goal, imageUri)
                            scope.launch { snackbarHostState.showSnackbar("Profile updated successfully") }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.Default.Save, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Save Profile")
                    }
                }
            }

            // Notifications Section
            SettingsSection(title = "Reminders") {
                SettingsRow(
                    icon = Icons.Default.Notifications,
                    label = "Daily Revision Reminder",
                    trailing = {
                        Switch(
                            checked = reminderEnabled,
                            onCheckedChange = {
                                reminderEnabled = it
                                PreferencesManager.setReminderEnabled(ctx, it)
                            }
                        )
                    }
                )

                if (reminderEnabled) {
                    SettingsRow(
                        icon = Icons.Default.Schedule,
                        label = "Reminder Time",
                        trailing = {
                            TextButton(onClick = {
                                val parts = reminderTime.split(":")
                                val hour = parts[0].toInt()
                                val min = parts[1].toInt()
                                TimePickerDialog(ctx, { _, h, m ->
                                    val newTime = String.format(Locale.getDefault(), "%02d:%02d", h, m)
                                    reminderTime = newTime
                                    PreferencesManager.setReminderTime(ctx, newTime)
                                }, hour, min, true).show()
                            }) {
                                Text(reminderTime, fontWeight = FontWeight.Bold, color = PrimaryDeep)
                            }
                        }
                    )
                }

                Button(
                    onClick = {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                            if (ContextCompat.checkSelfPermission(ctx, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                                permissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                            } else {
                                NotificationHelper.sendRevisionReminder(ctx, PreferencesManager.getRevisionCount(ctx))
                            }
                        } else {
                            NotificationHelper.sendRevisionReminder(ctx, PreferencesManager.getRevisionCount(ctx))
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer, contentColor = MaterialTheme.colorScheme.onSecondaryContainer)
                ) {
                    Text("Test Reminder Now")
                }
            }

            // Progress Section
            SettingsSection(title = "Data Management") {
                val practiced = PreferencesManager.getPracticed(ctx)
                val mastered = PreferencesManager.getMastered(ctx)
                val revisionCount = PreferencesManager.getRevisionCount(ctx)
                val streak = PreferencesManager.getStreakDays(ctx)

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        val percent = if (practiced == 0) 0f else (mastered.toFloat() / practiced.toFloat())
                        Box(contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(progress = { percent }, modifier = Modifier.size(60.dp), strokeWidth = 6.dp, color = PrimaryDeep)
                            Text("${(percent * 100).toInt()}%", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text("Practiced: $practiced", style = MaterialTheme.typography.bodyMedium)
                            Text("Mastered: $mastered", style = MaterialTheme.typography.bodyMedium)
                            Text("To Revise: $revisionCount", style = MaterialTheme.typography.bodyMedium)
                            Text("Streak: $streak days", style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                OutlinedButton(
                    onClick = { 
                        PreferencesManager.clearRevisionIds(ctx)
                        scope.launch { snackbarHostState.showSnackbar("Revision list cleared") }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error)
                ) {
                    Icon(Icons.Default.DeleteSweep, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Clear Revision List")
                }

                Button(
                    onClick = { showResetDialog = true },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                ) {
                    Icon(Icons.Default.Warning, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Reset All Progress")
                }
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }

    if (showResetDialog) {
        AlertDialog(
            onDismissRequest = { showResetDialog = false },
            title = { Text("Reset Progress?") },
            text = { Text("This will clear all your saved words, streaks, and quiz progress. This action cannot be undone.") },
            confirmButton = {
                TextButton(onClick = {
                    PreferencesManager.resetProgress(ctx)
                    showResetDialog = false
                    scope.launch { snackbarHostState.showSnackbar("Progress reset") }
                }, colors = ButtonDefaults.textButtonColors(contentColor = MaterialTheme.colorScheme.error)) {
                    Text("Reset Everything")
                }
            },
            dismissButton = {
                TextButton(onClick = { showResetDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

@Composable
fun SettingsSection(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            color = PrimaryDeep,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                content()
            }
        }
    }
}

@Composable
fun SettingsRow(icon: androidx.compose.ui.graphics.vector.ImageVector, label: String, trailing: @Composable () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(modifier = Modifier.width(12.dp))
            Text(label, style = MaterialTheme.typography.bodyLarge)
        }
        trailing()
    }
}
