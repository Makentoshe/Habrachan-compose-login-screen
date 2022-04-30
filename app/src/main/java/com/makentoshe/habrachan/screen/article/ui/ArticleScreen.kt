package com.makentoshe.habrachan.screen.article.ui

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
import androidx.compose.material.icons.outlined.PermIdentity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import com.makentoshe.habrachan.ui.widget.Toolbar

@Composable
fun ArticleScreen(
    controller: NavController,
) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = { ArticleScreenToolbar(controller) }) {
        ArticleScreenContent(controller)
    }
}

@Composable
private fun ArticleScreenToolbar(controller: NavController) = Toolbar(navigationBuilder = {
    IconButton(onClick = { controller.popBackStack() }) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
    }
}) {
    Text("Article title")
}

@Composable
private fun ArticleScreenContent(controller: NavController) = Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
) {
    Text(text = "Article screen content")

    Button(onClick = {}) {
        Text(text = "Navigate to user screen")
    }
    Button(onClick = {}) {
        Text(text = "Navigate to article comments screen")
    }
}
