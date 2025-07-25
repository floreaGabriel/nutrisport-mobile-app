package com.nutrisport.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nutrisport.auth.AuthScreen
import com.nutrisport.home.HomeGraphScreen
import com.nutrisport.shared.navigation.Screen

@Composable
fun SetupNavGraph(
    startDestination: Screen = Screen.Auth
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Screen.Auth> {
            AuthScreen(
                navigateToHome = {
                    navController.navigate(Screen.HomeGraph) {
                        popUpTo<Screen.Auth> { inclusive = true } // in this way we eliminate the auth screen from the backstack
                    }
                }
            )
        }
        composable<Screen.HomeGraph> {
            HomeGraphScreen()
        }
    }
}