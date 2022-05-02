package com.makentoshe.habrachan.screen.onboarding.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.onboarding.OnboardingScreenNavigationController

@Composable
fun OnboardingScreenSettings(
    controller: OnboardingScreenNavigationController
) = OnboardingScreen {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Settings screen content")

        Button(onClick = { controller.navigateToOnboardingLoginScreen() }) {
            Text("Navigate to Login screen")
        }
    }
}
