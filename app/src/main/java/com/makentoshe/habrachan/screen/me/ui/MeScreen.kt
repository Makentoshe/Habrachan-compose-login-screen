package com.makentoshe.habrachan.screen.me.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import com.makentoshe.habrachan.ui.widget.Toolbar

@Composable
internal fun MeScreen(
    content: @Composable (PaddingValues) -> Unit,
) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = { MeScreenToolbar() }) { content(it) }
}

@Composable
private fun MeScreenToolbar() = Toolbar {
    Text("Me screen toolbar")
}
