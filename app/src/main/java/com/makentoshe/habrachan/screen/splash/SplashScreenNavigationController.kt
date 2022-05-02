package com.makentoshe.habrachan.screen.splash

import androidx.navigation.NavController
import com.makentoshe.habrachan.navigation.SplashScreenNavigator
import com.makentoshe.habrachan.screen.Screen

class SplashScreenNavigationController(private val controller: NavController) : SplashScreenNavigator {

    override fun navigateToOnboardingScreen() {
        controller.navigate(Screen.Onboarding.toString()) {
            controller.popBackStack(route = Screen.Splash.toString(), inclusive = true)
        }
    }
}