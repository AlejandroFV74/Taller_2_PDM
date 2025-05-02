package com.pdmtaller2.AbrahamFlores_00067323.screens

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.pdmtaller2.AbrahamFlores_00067323.components.DishItem
import com.pdmtaller2.AbrahamFlores_00067323.data.sampleRestaurants
import com.pdmtaller2.AbrahamFlores_00067323.components.SearchBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, restaurantId: String?) {
    val context = LocalContext.current
    val restaurant = sampleRestaurants.find { it.id == restaurantId }
    var query by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = restaurant?.name ?: "Menú") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) {
        restaurant?.let {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(it.name, style = MaterialTheme.typography.headlineMedium)
                Text(it.description)

                Spacer(modifier = Modifier.height(16.dp))

                SearchBar(query = query, onQueryChange = { query = it })

                Spacer(modifier = Modifier.height(16.dp))

                val filteredMenu = restaurant.menu.filter {
                    it.name.contains(query, ignoreCase = true)
                }

                LazyColumn {
                    items(filteredMenu) { dish ->
                        DishItem(dish) {
                            Toast.makeText(
                                context,
                                "${dish.name} agregado al carrito",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        }
    }
}




