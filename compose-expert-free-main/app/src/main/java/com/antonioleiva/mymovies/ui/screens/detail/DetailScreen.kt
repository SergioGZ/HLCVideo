package com.antonioleiva.mymovies.ui.screens.detail

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.screens.shared.ArrowBackIcon
import com.antonioleiva.mymovies.ui.screens.shared.Thumb

@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {
    val mediaItem = remember { getMedia().first { it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = mediaItem.title) },
                backgroundColor = Color.LightGray,
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        }
    ) {
        Thumb(mediaItem = mediaItem)
    }
}