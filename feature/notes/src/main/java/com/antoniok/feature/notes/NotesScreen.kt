package com.antoniok.feature.notes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NotesRoute(modifier: Modifier = Modifier) {
    NotesScreen(modifier = modifier)
}

@Composable
internal fun NotesScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            color = Color.Black,
            text = "Hello world from list"
        )
    }
}

@Preview
@Composable
private fun NotesScreenPreview() {
    NotesScreen()
}
