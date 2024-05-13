package com.example.rajatugasilmobile2.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object About: Screen("about")
    data object DetailPlace: Screen("detail_place")
    data object DetailCategory: Screen("detail_category")
    data object DetailPlayer: Screen("detail_player")
}