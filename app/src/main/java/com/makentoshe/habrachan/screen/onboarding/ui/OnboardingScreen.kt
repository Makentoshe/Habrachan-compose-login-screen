package com.makentoshe.habrachan.screen.onboarding.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme

@Composable
internal fun OnboardingScreen(
    controller: NavController,
    content: @Composable (PaddingValues) -> Unit,
) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = { OnboardingScreenTopbar() }) {
        content(it)
    }
}

@Composable
private fun OnboardingScreenTopbar() = TopAppBar(
    contentColor = MaterialTheme.colors.onPrimary,
    elevation = 4.dp,
    title = {
        Text(text = "Habrachan onboarding", color = MaterialTheme.colors.onPrimary)
    },
    backgroundColor = MaterialTheme.colors.primary
)

