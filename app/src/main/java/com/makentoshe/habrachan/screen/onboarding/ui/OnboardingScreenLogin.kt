package com.makentoshe.habrachan.screen.onboarding.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.makentoshe.habrachan.screen.onboarding.OnboardingScreenNavigationController

@Composable
fun OnboardingScreenLogin(
    controller: OnboardingScreenNavigationController,
) = OnboardingScreen {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Login screen content")

        Button(onClick = { controller.navigateToMainScreen() }) {
            Text("Finish onboarding screen")
        }
    }

}
