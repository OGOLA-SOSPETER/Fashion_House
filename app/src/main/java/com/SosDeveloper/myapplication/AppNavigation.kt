package com.SosDeveloper.myapplication

import SuitsPage
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController,startDestination = "Login")
    {

        composable("Login"){ LoginPage(navController)}
        composable("Dashboard"){ MainPage(navController)}
        composable("welcome"){ WelcomePage(navController)}
        composable("settings"){ SettingsPage(navController) }
        composable("About"){ AboutApp(navController) }
        composable("Emails"){ EmailPage(navController)}
        composable("FaceBook"){ FaceBookPage(navController) }
        composable("shirts"){ ShirtsPage(navController)}
        composable("trousers"){TrouserPage(navController)}
        composable("footwear"){ FullWear(navController)}
        composable("briefcases"){ Briefcase(navController) }
        composable("bedding"){ BeddingPage(navController )}
        composable("heels"){ HeelsPage(navController ) }
        composable("handbag"){ HandbagPage(navController)}
        composable("belt"){ BeltPage(navController)}
        composable("shoes"){ ShoesPage(navController )}
        composable("suits"){ SuitsPage(navController )}
    }
}
