@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package com.makentoshe.habrachan.ui.widget

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

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
    DefaultToolbarTitle(title)
}

@Composable
fun NavigationToolbar(
    controller: NavController,
    titleBuilder: @Composable () -> Unit,
) = Toolbar(titleBuilder = titleBuilder, navigationBuilder = {
    val onClickAction: () -> Unit = { controller.popBackStack() }

    IconButton(onClick = onClickAction, modifier = Modifier.combinedClickable(onClick = onClickAction, onLongClick = {
        println("Sas")
    })) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
    }
})

@Composable
fun NavigationToolbar(controller: NavController, title: String) = NavigationToolbar(controller) {
    DefaultToolbarTitle(title)
}

@Composable
private fun DefaultToolbarTitle(title: String) = Text(text = title, color = MaterialTheme.colors.onPrimary)