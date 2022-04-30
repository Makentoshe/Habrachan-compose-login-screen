package com.makentoshe.habrachan.screen.me.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.makentoshe.habrachan.screen.Screen

@Composable
fun MeScreenLogin(controller: NavController) = MeScreen {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Me screen login")

        Button(onClick = { controller.navigate(route = Screen.Me.User.toString()) {
            controller.popBackStack(route = Screen.Me.Login.toString(), inclusive = true)
        } }) {
            Text("Perform Login")
        }
    }
}
