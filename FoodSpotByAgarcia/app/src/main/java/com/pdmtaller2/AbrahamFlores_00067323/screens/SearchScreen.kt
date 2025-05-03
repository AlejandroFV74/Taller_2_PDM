package com.pdmtaller2.AbrahamFlores_00067323.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import com.pdmtaller2.AbrahamFlores_00067323.data.sampleRestaurants
import com.pdmtaller2.AbrahamFlores_00067323.components.RestaurantCard
import androidx.compose.foundation.lazy.items



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    var query by remember { mutableStateOf("") }

    val filteredRestaurants = remember(query) {
        if (query.isBlank()) {
            emptyList()
        } else {
            sampleRestaurants.filter { restaurant ->
                val matchesName = restaurant.name.contains(query, ignoreCase = true)
                val matchesCategory = restaurant.category.contains(query, ignoreCase = true)
                val matchesDishes = restaurant.menu.any { dish ->
                    dish.name.contains(query, ignoreCase = true)
                }
                matchesName || matchesCategory || matchesDishes
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de búsqueda") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Buscar restaurante, platillo o categoría") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (filteredRestaurants.isEmpty()) {
                Text("No se encontraron resultados.")
            } else {
                LazyColumn {
                    items(filteredRestaurants) { restaurant ->
                        RestaurantCard(restaurant = restaurant) {
                            navController.navigate("menu/${restaurant.id}")
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                }
            }
        }
    }
}


