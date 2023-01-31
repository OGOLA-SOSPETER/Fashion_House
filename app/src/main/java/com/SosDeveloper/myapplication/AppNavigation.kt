package com.SosDeveloper.myapplication

import SuitsPage
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import progress.CardDemo

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController,startDestination = "Login")
    {

        composable("Login"){ LoginPage(navController)}
        composable("Dashboard"){ Scaffolld(navController) }
        composable("welcome"){ WelcomePage(navController)}
        composable("cards"){ CardDemo(navController )}
        composable("settings"){ SettingsPage(navController) }
        composable("About"){ AboutApp(navController) }
        composable("Emails"){ EmailPage(navController)}
        composable("FaceBook"){ FaceBookPage(navController) }
        composable("shirts"){ ShirtsPage(navController)}
        composable("trousers"){TrouserPage(navController)}
        composable("footwear"){ FootWear(navController)}
        composable("briefcases"){ Briefcase(navController) }
        composable("bedding"){ BeddingPage(navController )}
        composable("heels"){ HeelsPage(navController ) }
        composable("handbag"){ HandbagPage(navController)}
        composable("belt"){ ScaffoldDemo(navController) }
        composable("shoes"){ ShoesPage(navController )}
        composable("suits"){ SuitsPage(navController )}
    }
}
