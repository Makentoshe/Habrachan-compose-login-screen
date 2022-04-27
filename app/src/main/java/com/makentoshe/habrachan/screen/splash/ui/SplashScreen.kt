package com.makentoshe.habrachan.screen.splash.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import com.makentoshe.habrachan.R
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import java.util.Timer
import kotlin.concurrent.timerTask
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

@Composable
internal fun SplashScreen(
    controller: NavController,
) = HabrachanOnboardingScreenTheme {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), "")
    }

    rememberCoroutineScope().launch {
        flowOf(controller).debounce(3000).collectLatest {
            controller.navigate("onboarding")
        }
    }
}
