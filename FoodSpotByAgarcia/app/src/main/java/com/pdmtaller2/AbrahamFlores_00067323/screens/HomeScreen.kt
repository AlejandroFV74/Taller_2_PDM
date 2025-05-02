package com.pdmtaller2.AbrahamFlores_00067323.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.pdmtaller2.AbrahamFlores_00067323.data.sampleRestaurants
import com.pdmtaller2.AbrahamFlores_00067323.components.RestaurantCard

@Composable
fun HomeScreen(navController: NavController) {
    val grouped = sampleRestaurants.groupBy { it.category }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        grouped.forEach { (category, restaurants) ->
            item {
                Text(category, style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                LazyRow {
                    items(restaurants) { restaurant ->
                        RestaurantCard(restaurant) {
                            navController.navigate("menu/${restaurant.id}")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun composableHomeScreen(){
    val navController = rememberNavController()
    HomeScreen(navController)
}

