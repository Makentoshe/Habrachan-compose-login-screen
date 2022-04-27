package com.makentoshe.habrachan.screen.onboarding

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class OnboardingViewModelImpl(
    private val controller: NavController,
) : ViewModel(), OnboardingViewModel {

    private var internalState by mutableStateOf<OnboardingScreenState>(OnboardingScreenState.Settings)
    override val state: OnboardingScreenState get() = internalState

    override fun proceedToState(state: OnboardingScreenState) {
        internalState = state
    }

    override fun next() {
        val next = internalState.next ?: return controller.navigate("test")
        internalState = next
    }
}