package com.makentoshe.habrachan.screen.user

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.user.ui.UserScreen

fun NavGraphBuilder.userScreenGraph(controller: NavController) {
    composable(route = Screen.User.toString()) {
        UserScreen(controller)
    }
}

object UserScreen {
    override fun toString() = "user"
}
