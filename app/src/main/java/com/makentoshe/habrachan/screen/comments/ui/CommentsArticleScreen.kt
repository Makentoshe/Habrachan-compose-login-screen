package com.makentoshe.habrachan.screen.comments.ui

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
fun CommentsArticleScreen(controller: NavController) = CommentsScreen(
    controller = controller, toolbar = { CommentsArticleScreenToolbar() },
    content = { CommentsArticleScreenContent(controller) }
)

@Composable
private fun CommentsArticleScreenToolbar() {
    Text("Article title")
}

@Composable
private fun CommentsArticleScreenContent(controller: NavController) = Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
) {
    Text("Article comments content")

    Button(onClick = { controller.navigate(Screen.Comments.Thread.toString()) }) {
        Text("Thread comments screen")
    }
}