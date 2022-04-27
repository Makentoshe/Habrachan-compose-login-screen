package com.makentoshe.habrachan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenLogin
import com.makentoshe.habrachan.screen.onboarding.ui.OnboardingScreenSettings
import com.makentoshe.habrachan.screen.onboardingScreenGraph
import com.makentoshe.habrachan.screen.splash.splashScreenGraph
import com.makentoshe.habrachan.screen.splash.ui.SplashScreen
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.setDefaultUncaughtExceptionHandler { _, e -> throw e }

        super.onCreate(savedInstanceState)
        setContent { HabrachanOnboardingScreenTheme { buildNavigationController() } }
    }
}

@Composable
fun buildNavigationController(): NavController {
    return rememberNavController().also { controller ->
        NavHost(navController = controller, Screen.Splash.toString()) {
            splashScreenGraph(controller)
            onboardingScreenGraph(controller)

            composable("test") {
                Greeting("Test")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
