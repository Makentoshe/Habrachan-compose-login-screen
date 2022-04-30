package com.makentoshe.habrachan.screen.me

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.me.ui.MeScreenLogin
import com.makentoshe.habrachan.screen.me.ui.MeScreenUser

fun NavGraphBuilder.meScreenGraph(controller: NavController) {
    navigation(startDestination = Screen.Me.Login.toString(), route = Screen.Me.toString()) {
        composable(route = Screen.Me.Login.toString()) {
            MeScreenLogin(controller)
        }
        composable(route = Screen.Me.User.toString()) {
            MeScreenUser(controller)
        }
    }
}
