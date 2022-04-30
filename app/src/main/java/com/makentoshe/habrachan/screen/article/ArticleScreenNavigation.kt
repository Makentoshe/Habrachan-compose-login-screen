package com.makentoshe.habrachan.screen.article

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.article.ui.ArticleScreen

fun NavGraphBuilder.articleScreenGraph(controller: NavController) {
    composable(route = Screen.Article.toString()) {
        ArticleScreen(controller)
    }
}

object ArticleScreen {
    override fun toString() = "article"
}