package com.makentoshe.habrachan.screen.onboarding

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.makentoshe.habrachan.screen.OnboardingLoginScreen
import com.makentoshe.habrachan.screen.OnboardingScreen
import com.makentoshe.habrachan.screen.OnboardingSettingsScreen
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenLogin
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenSettings

fun NavGraphBuilder.onboardingScreenGraph(controller: NavController) {
    val navigationController = OnboardingScreenNavigationController(controller)
    navigation(startDestination = OnboardingSettingsScreen.toString(), route = OnboardingScreen.toString()) {
        composable(route = OnboardingSettingsScreen.toString()) {
            OnboardingScreenSettings(navigationController)
        }
        composable(route = OnboardingLoginScreen.toString()) {
            OnboardingScreenLogin(navigationController)
        }
    }
}

