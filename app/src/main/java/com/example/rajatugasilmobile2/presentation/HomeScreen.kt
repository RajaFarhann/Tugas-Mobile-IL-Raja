package com.example.rajatugasilmobile2.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.rajatugasilmobile2.data.Data
import com.example.rajatugasilmobile2.model.Category
import com.example.rajatugasilmobile2.model.Place
import com.example.rajatugasilmobile2.navigation.Screen
import com.example.rajatugasilmobile2.presentation.component.CategoryItem
import com.example.rajatugasilmobile2.presentation.component.PlaceItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    categories: List<Category> = Data.Categories,
    places: List<Place> = Data.Places,
    ) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(categories, key = { it.id }) {
                    CategoryItem(category = it) { categoryId ->
                        navController.navigate(Screen.DetailCategory.route + "/$categoryId")
                    }
                }
            }
        }
        items(places, key = { it.id }) {
            PlaceItem(place = it){ mentorId ->
                navController.navigate(Screen.DetailPlace.route + "/$mentorId")
            }
        }
    }
}