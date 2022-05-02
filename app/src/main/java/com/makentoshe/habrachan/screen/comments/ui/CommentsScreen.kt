package com.makentoshe.habrachan.screen.comments.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import com.makentoshe.habrachan.ui.widget.NavigationToolbar

@Composable
fun CommentsScreen(
    controller: NavController,
    toolbar: @Composable () -> Unit,
    content: @Composable (PaddingValues) -> Unit,
) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = { CommentsToolbar(controller, toolbar) }, content = content)
}

@Composable
private fun CommentsToolbar(
    controller: NavController,
    toolbarBuilder: @Composable () -> Unit,
) = NavigationToolbar(controller = controller, titleBuilder = toolbarBuilder)