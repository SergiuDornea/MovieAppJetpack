package com.example.movieapp2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp2.model.getMovies
import com.example.movieapp2.screens.screen.HomeScreen
import com.example.movieapp2.screen.details.DetailsScreen

@Composable
fun MovieNavigation(){
    // instantiate nav controller
    val navController = rememberNavController()
    // create nav host
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name ){// in this trialing lambda build nav graph
        composable(MovieScreens.HomeScreen.name){
            // here you pas where this should lead us to, the actual composable
            HomeScreen(navController = navController)
        }

        composable(MovieScreens.DetailsScreen.name+"/{movie}",
            arguments = listOf(navArgument(name = "movie") {type = NavType.StringType})
            ){
            backStackEntry ->

            DetailsScreen(navController = navController, backStackEntry.arguments?.getString("movie"), getMovies())
        }
    }
}