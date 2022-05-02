package com.makentoshe.habrachan.screen

import com.makentoshe.habrachan.screen.article.ArticleScreen
import com.makentoshe.habrachan.screen.comments.CommentsScreen
import com.makentoshe.habrachan.screen.me.MeScreen
import com.makentoshe.habrachan.screen.user.UserScreen

object Screen {
    val Splash = SplashScreen
    val Onboarding = OnboardingScreen
    val Main = MainScreen

    val Me = MeScreen

    val Article = ArticleScreen

    val User = UserScreen

    val Comments = CommentsScreen
}

object SplashScreen {
    override fun toString() = "splash"
}

object OnboardingScreen {
    override fun toString() = "onboarding"

    val Settings = OnboardingSettingsScreen

    val Login = OnboardingLoginScreen
}

object OnboardingSettingsScreen {
    override fun toString() = "$OnboardingScreen.settings"
}

object OnboardingLoginScreen {
    override fun toString() = "$OnboardingScreen.login"
}

object MainScreen {
    override fun toString() = "main"
}
