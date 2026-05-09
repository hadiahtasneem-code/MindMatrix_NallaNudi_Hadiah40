package com.example.nelanudi.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = PrimaryDeep,
    onPrimary = SurfaceWhite,
    primaryContainer = SurfaceBlue,
    onPrimaryContainer = TextPrimary,
    secondary = PrimarySky,
    onSecondary = SurfaceWhite,
    secondaryContainer = ColorMathLight,
    onSecondaryContainer = ColorMath,
    background = BackgroundBlue,
    surface = SurfaceWhite,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    error = ColorError,
    outline = TextMuted
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDeep,
    background = Color(0xFF071526),
    surface = Color(0xFF0D1B2A),
    primaryContainer = Color(0xFF0D2137),
    onBackground = Color(0xFFE8F4FD),
    onSurface = Color(0xFFE8F4FD),
    outline = Color(0xFF37474F)
)

@Composable
fun NallaNudiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val view = LocalView.current

    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
