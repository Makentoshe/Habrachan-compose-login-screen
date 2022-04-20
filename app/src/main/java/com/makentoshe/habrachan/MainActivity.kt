package com.makentoshe.habrachan

import android.os.Bundle
import android.webkit.CookieManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.makentoshe.habrachan.interactor.LoginCookieInteractor
import com.makentoshe.habrachan.repository.LoginRepository
import com.makentoshe.habrachan.screen.onboarding.OnboardingScreen
import com.makentoshe.habrachan.screen.onboarding.di.OnboardingScreenDi
import com.makentoshe.habrachan.screen.onboarding.model.CookieParser
import com.makentoshe.habrachan.screen.onboarding.model.KtorCookieParser
import com.makentoshe.habrachan.screen.onboarding.model.OnboardingWebViewClient
import com.makentoshe.habrachan.screen.onboarding.model.OnboardingWebViewClientImpl
import com.makentoshe.habrachan.screen.onboarding.viewmodel.OnboardingViewModel
import com.makentoshe.habrachan.screen.onboarding.viewmodel.OnboardingViewModelImpl
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO

class OnboardingScreenDiImpl(client: HttpClient) : OnboardingScreenDi {
    private val cookieManager = CookieManager.getInstance().apply { this.removeAllCookies { } }
    private val cookieParser: CookieParser = KtorCookieParser()
    private val loginCookieInteractor = LoginCookieInteractor(LoginRepository(client))

    override val url: String = "https://habr.com/kek/v1/auth/habrahabr?back=%2Fen%2Fall%2F"
    override val viewModel: OnboardingViewModel = OnboardingViewModelImpl(loginCookieInteractor)
    override val webViewClientFactory: OnboardingWebViewClient.Factory = OnboardingWebViewClientImpl.Factory(cookieParser, cookieManager)
}

class MainActivity : ComponentActivity() {

    private val onboardingScreenDi = OnboardingScreenDiImpl(HttpClient(CIO) { followRedirects = false })

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.setDefaultUncaughtExceptionHandler { _, e -> throw e }

        super.onCreate(savedInstanceState)
        setContent { HabrachanOnboardingScreenTheme { buildNavigationController(onboardingScreenDi) } }
    }
}

@Composable
fun buildNavigationController(onboardingScreenDi: OnboardingScreenDiImpl): NavController {
    return rememberNavController().also { controller ->
        NavHost(navController = controller, "main") {
            composable("main") {
                OnboardingScreen(controller, onboardingScreenDi)
            }
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
