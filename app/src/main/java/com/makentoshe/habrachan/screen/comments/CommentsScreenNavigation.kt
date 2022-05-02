package com.makentoshe.habrachan.screen.comments

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.screen.comments.ui.CommentsArticleScreen
import com.makentoshe.habrachan.screen.comments.ui.CommentsThreadScreen

fun NavGraphBuilder.commentsScreenGraph(controller: NavController) {
    navigation(startDestination = Screen.Comments.Article.toString(), route = Screen.Comments.toString()) {
        composable(route = Screen.Comments.Article.toString()) {
            CommentsArticleScreen(controller)
        }
        composable(route = Screen.Comments.Thread.toString()) {
            CommentsThreadScreen(controller)
        }
    }
}

object CommentsScreen {
    override fun toString() = "comments"

    val Article = CommentsArticleScreen

    val Thread = CommentsThreadScreen
}

object CommentsArticleScreen {
    override fun toString() = "$CommentsScreen.article"
}

object CommentsThreadScreen {
    override fun toString() = "$CommentsScreen.thread"
}
