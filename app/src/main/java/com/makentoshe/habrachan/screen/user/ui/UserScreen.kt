package com.makentoshe.habrachan.screen.user.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import com.makentoshe.habrachan.ui.widget.Toolbar

@Composable
internal fun UserScreen(controller: NavController) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = { UserScreenToolbar(controller) }) { UserScreenContent(controller) }
}

@Composable
private fun UserScreenToolbar(controller: NavController) = Toolbar(
    navigationBuilder = {
        IconButton(onClick = { controller.popBackStack() }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
        }
    }
) {
    Text("Username")
}

@Composable
private fun UserScreenContent(controller: NavController) = Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
) {
    Text(text = "User screen content")

    Button(onClick = { controller.navigate(Screen.Article.toString()) }) {
        Text(text = "User article screen")
    }

    Button(onClick = { controller.navigate(Screen.Comments.Thread.toString()) }) {
        Text(text = "User comments screen")
    }
}