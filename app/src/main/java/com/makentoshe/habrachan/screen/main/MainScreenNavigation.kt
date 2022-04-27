package com.makentoshe.habrachan.screen.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.main.ui.MainScreen

fun NavGraphBuilder.mainScreenGraph(controller: NavController) {
    composable(route = Screen.Main.toString()) {
        MainScreen(controller)
    }
}
