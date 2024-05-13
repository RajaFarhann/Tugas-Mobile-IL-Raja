package com.example.rajatugasilmobile2.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CoPresent
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.rajatugasilmobile2.data.Data
import com.example.rajatugasilmobile2.navigation.NavigationItem
import com.example.rajatugasilmobile2.navigation.Screen
import com.example.rajatugasilmobile2.presentation.detailScreen.DetailCategoryScreen
import com.example.rajatugasilmobile2.presentation.detailScreen.DetailPlaceScreen
import com.example.rajatugasilmobile2.presentation.detailScreen.DetailPlayerScreen
import com.example.rajatugasilmobile2.ui.theme.RajaTugasILMobile2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RajaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
    ) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Infinite App")
                },
            )
        },
        bottomBar = {
            BottomBar(navController)
    },
    modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Gallery.route) {
                GalleryScreen(
                    galleries = Data.Galleries,
                    navController = navController
                ){
                    galleryId -> println("Gallery Id : $galleryId")
                }
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                Screen.DetailCategory.route + "/{categoryId}",
                arguments = listOf(navArgument("categoryId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailCategoryScreen(
                    navController = navController,
                    categoryId = navBackStackEntry.arguments?.getInt("categoryId")
                )
            }
            composable(
                Screen.DetailPlace.route + "/{placeId}",
                arguments = listOf(navArgument("placeId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailPlaceScreen(
                    navController = navController,
                    placeId = navBackStackEntry.arguments?.getInt("placeId")
                )
            }
            composable(
                Screen.DetailPlayer.route + "/{galleryId}",
                arguments = listOf(navArgument("galleryId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailPlayerScreen(
                    navController = navController,
                    galleryId = navBackStackEntry.arguments?.getInt("galleryId")
                )
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = "Home",
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = "Gallery",
                icon = Icons.Default.Topic,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = "About",
                icon = Icons.Default.CoPresent,
                screen = Screen.About
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun RajaAppScreen() {
    RajaTugasILMobile2Theme {
        RajaApp()
    }
}