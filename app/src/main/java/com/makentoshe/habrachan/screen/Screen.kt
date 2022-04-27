package com.makentoshe.habrachan.screen

object Screen {
    val Splash = SplashScreen
    val Onboarding = OnboardingScreen
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
