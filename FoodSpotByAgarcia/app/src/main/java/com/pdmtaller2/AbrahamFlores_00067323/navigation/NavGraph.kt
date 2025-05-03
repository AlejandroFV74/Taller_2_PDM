package com.pdmtaller2.AbrahamFlores_00067323.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pdmtaller2.AbrahamFlores_00067323.components.BottomNavigationBar
import com.pdmtaller2.AbrahamFlores_00067323.screens.HomeScreen
import com.pdmtaller2.AbrahamFlores_00067323.screens.MenuScreen
import com.pdmtaller2.AbrahamFlores_00067323.screens.OrderScreen
import com.pdmtaller2.AbrahamFlores_00067323.screens.SearchScreen


object Routes {
    const val HOME = "home"
    const val MENU = "menu/{restaurantId}"
    const val ORDER = "order"
    const val SEARCH = "search"
}

@Composable
fun NavGraph(startDestination: String = Routes.HOME) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            // Mostrar la barra inferior solo si esta en pantallas principales
            val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
            if (currentRoute == Routes.HOME || currentRoute == Routes.ORDER || currentRoute == Routes.SEARCH) {
                BottomNavigationBar(navController = navController)
            }
        }
    ) { innerPadding ->
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(Routes.HOME) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Routes.MENU,
            arguments = listOf(navArgument("restaurantId") { type = NavType.StringType })

        ) { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("restaurantId")
            MenuScreen(navController, restaurantId)
        }
        composable(Routes.ORDER) {
            OrderScreen()
        }
        composable(Routes.SEARCH) {
            SearchScreen()
        }
        }
    }
}

