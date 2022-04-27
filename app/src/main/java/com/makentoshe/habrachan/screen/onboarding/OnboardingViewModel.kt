package com.makentoshe.habrachan.screen.onboarding

interface OnboardingViewModel {
    val state: OnboardingScreenState

    fun proceedToState(state: OnboardingScreenState)

    fun next()
}

