package com.idiomasinternacionales.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idiomasinternacionales.ui.screens.*

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Vocabulario : Screen("vocabulario")
    object Gramatica : Screen("gramatica")
    object ComprensionAuditiva : Screen("comprension_auditiva")
    object ComprensionOral : Screen("comprension_oral")
    object RutaIA : Screen("ruta_ia")
}

@Composable
fun MainNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Vocabulario.route) { VocabularioScreen() }
        composable(Screen.Gramatica.route) { GramaticaScreen() }
        composable(Screen.ComprensionAuditiva.route) { ComprensionAuditivaScreen() }
        composable(Screen.ComprensionOral.route) { ComprensionOralScreen() }
        composable(Screen.RutaIA.route) { RutaIAScreen() }
    }
}
