package com.makentoshe.habrachan.screen.splash

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.splash.ui.SplashScreen

fun NavGraphBuilder.splashScreenGraph(controller: NavController) {
    composable(route = Screen.Splash.toString()) {
        SplashScreen(SplashScreenNavigationController(controller))
    }
}
