package com.pdmtaller2.AbrahamFlores_00067323.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pdmtaller2.AbrahamFlores_00067323.screens.HomeScreen
import com.pdmtaller2.AbrahamFlores_00067323.screens.MenuScreen


object Routes {
    const val HOME = "home"
    const val MENU = "menu/{restaurantId}"
    const val ORDER = "order"
    const val SEARCH = "search"
}

@Composable
fun NavGraph(startDestination: String = Routes.HOME) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
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
    }
}

