package com.makentoshe.habrachan.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenLogin
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenSettings

fun NavGraphBuilder.onboardingScreenGraph(controller: NavController) {
    navigation(startDestination = Screen.Onboarding.Settings.toString(), route = Screen.Onboarding.toString()) {
        composable(route = Screen.Onboarding.Settings.toString()) {
            OnboardingScreenSettings(controller)
        }
        composable(route = Screen.Onboarding.Login.toString()) {
            OnboardingScreenLogin(controller)
        }
    }
}