@file:OptIn(ExperimentalPagerApi::class)

package com.makentoshe.habrachan.screen.main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PermIdentity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.makentoshe.habrachan.screen.Screen
import com.makentoshe.habrachan.ui.theme.HabrachanOnboardingScreenTheme
import com.makentoshe.habrachan.ui.theme.brand
import com.makentoshe.habrachan.ui.theme.dimmed
import com.makentoshe.habrachan.ui.widget.Toolbar
import kotlinx.coroutines.launch

private val testIsLogin = true

@Composable
fun MainScreen(
    controller: NavController,
) = HabrachanOnboardingScreenTheme {
    Scaffold(topBar = {
        Toolbar("Habrachan(or Username)") {
            IconButton(onClick = { if (testIsLogin) {
                controller.navigate(route = Screen.Me.User.toString())
            } else {
                controller.navigate(route = Screen.Me.Login.toString())
            }
            }) {
                Icon(imageVector = Icons.Outlined.PermIdentity, contentDescription = null)
            }
        }
    }) { MainScreenContent(controller) }
}

@Composable
private fun MainScreenContent(controller: NavController) {
    val tabTitles = listOf("Subscribed", "All articles", "Interesting", "Top of Daily")
    val pagerState = rememberPagerState()

    Column {
        MainScreenContentTabs(tabTitles, pagerState)
        MainScreenContentPages(tabTitles, pagerState, controller)
    }
}

@Composable
private fun MainScreenContentTabs(tabs: List<String>, state: PagerState) {
    val scope = rememberCoroutineScope()

    ScrollableTabRow(
        edgePadding = 0.dp,
        selectedTabIndex = state.currentPage,
        backgroundColor = MaterialTheme.colors.background,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                color = MaterialTheme.colors.brand,
                modifier = Modifier.tabIndicatorOffset(tabPositions[state.currentPage])
            )
        }
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = index == state.currentPage,
                text = { Text(text = title) },
                onClick = { scope.launch { state.animateScrollToPage(index) } },
                selectedContentColor = MaterialTheme.colors.brand,
                unselectedContentColor = MaterialTheme.colors.dimmed
            )
        }
    }
}

@Composable
private fun MainScreenContentPages(tabs: List<String>, state: PagerState, controller: NavController) {
    HorizontalPager(count = tabs.size, state = state) { page ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "Page: $page")
            Text(text = "Title: ${tabs[page]}")
            Button(onClick = {
                //
            }) {
                Text("Navigate to Article screen")
            }
        }
    }
}
