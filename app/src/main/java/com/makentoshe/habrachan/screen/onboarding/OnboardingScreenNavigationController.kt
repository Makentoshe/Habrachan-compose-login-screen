package com.makentoshe.habrachan.screen.onboarding

import androidx.navigation.NavController
import com.makentoshe.habrachan.navigation.OnboardingScreenNavigator
import com.makentoshe.habrachan.screen.OnboardingLoginScreen
import com.makentoshe.habrachan.screen.OnboardingScreen
import com.makentoshe.habrachan.screen.Screen

class OnboardingScreenNavigationController(private val controller: NavController) : OnboardingScreenNavigator {

    override fun navigateToOnboardingLoginScreen() {
        controller.navigate(route = OnboardingLoginScreen.toString())
    }

    override fun navigateToMainScreen() = controller.navigate(route = Screen.Main.toString()) {
        controller.popBackStack(route = OnboardingScreen.toString(), inclusive = true)
    }
}