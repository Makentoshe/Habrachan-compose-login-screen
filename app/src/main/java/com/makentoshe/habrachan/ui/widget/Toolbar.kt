package com.makentoshe.habrachan.ui.widget

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun Toolbar(
    navigationBuilder: (@Composable () -> Unit)? = null,
    titleBuilder: @Composable () -> Unit,
) = TopAppBar(
    contentColor = MaterialTheme.colors.onPrimary,
    title = titleBuilder,
    backgroundColor = MaterialTheme.colors.primary,
    navigationIcon = navigationBuilder
)

@Composable
fun Toolbar(title: String, navigationBuilder: (@Composable () -> Unit)? = null) = Toolbar(navigationBuilder) {
    Text(text = title, color = MaterialTheme.colors.onPrimary)
}
