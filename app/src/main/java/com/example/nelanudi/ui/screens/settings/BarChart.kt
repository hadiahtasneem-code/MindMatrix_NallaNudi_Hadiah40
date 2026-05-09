package com.example.nelanudi.ui.screens.settings

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun BarChart(data: Map<String, Int>, modifier: Modifier = Modifier) {
    // Simple horizontal bar chart for last N days
    val items = data.entries.sortedBy { it.key }
    val barColor = MaterialTheme.colorScheme.primary
    val trackColor = MaterialTheme.colorScheme.surfaceVariant
    val textColor = MaterialTheme.colorScheme.onBackground

    Column(modifier = modifier.fillMaxWidth()) {
        items.forEach { (date, value) ->
            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                val label = date.takeLast(5) // MM-DD or similar
                Box(modifier = Modifier.width(48.dp)) {
                    androidx.compose.material3.Text(
                        text = label, 
                        style = MaterialTheme.typography.labelSmall,
                        color = textColor
                    )
                }
                val max = (items.maxOfOrNull { it.value } ?: 1).coerceAtLeast(1)
                val fraction = value.toFloat() / max.toFloat()
                Canvas(modifier = Modifier
                    .height(12.dp)
                    .fillMaxWidth()
                    .padding(start = 8.dp)
                    .clip(RoundedCornerShape(6.dp))) {
                    val w = size.width * fraction
                    drawRect(color = barColor, size = androidx.compose.ui.geometry.Size(w, size.height))
                    drawRect(color = trackColor, topLeft = androidx.compose.ui.geometry.Offset(w, 0f), size = androidx.compose.ui.geometry.Size(size.width - w, size.height))
                }
            }
        }
    }
}

