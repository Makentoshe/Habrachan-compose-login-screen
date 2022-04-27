package com.makentoshe.habrachan.screen.onboarding

sealed class OnboardingScreenState {
    abstract val title: String
    abstract val next: OnboardingScreenState?

    object Settings : OnboardingScreenState() {
        override val title: String = "Settings"
        override val next = Login
    }

    object Login : OnboardingScreenState() {
        override val title: String = "Login"
        override val next = null
    }
}