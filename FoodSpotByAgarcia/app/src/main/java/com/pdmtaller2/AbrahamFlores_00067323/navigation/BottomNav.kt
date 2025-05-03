package com.pdmtaller2.AbrahamFlores_00067323.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val label: String, val icon: ImageVector) {
    object Restaurants : BottomNavItem("home", "Restaurantes", Icons.Filled.List)
    object Search : BottomNavItem("search", "Buscar", Icons.Filled.Search)
    object Orders : BottomNavItem("order", "Mis Órdenes", Icons.Filled.ShoppingCart)
}
