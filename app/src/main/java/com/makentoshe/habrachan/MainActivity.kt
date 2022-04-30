package com.makentoshe.habrachan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.article.articleScreenGraph
import com.makentoshe.habrachan.screen.main.mainScreenGraph
import com.makentoshe.habrachan.screen.me.meScreenGraph
import com.makentoshe.habrachan.screen.onboardingScreenGraph
import com.makentoshe.habrachan.screen.splash.splashScreenGraph
import com.makentoshe.habrachan.screen.user.userScreenGraph
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
        NavHost(navController = controller, Screen.Main.toString()) {
            splashScreenGraph(controller)
            onboardingScreenGraph(controller)
            mainScreenGraph(controller)
            meScreenGraph(controller)
            articleScreenGraph(controller)
            userScreenGraph(controller)
        }
    }
}
