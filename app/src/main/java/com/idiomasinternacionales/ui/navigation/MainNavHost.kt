package com.idiomasinternacionales.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idiomasinternacionales.ui.screens.HomeScreen
import com.idiomasinternacionales.ui.screens.IAFeedbackScreen
import com.idiomasinternacionales.ui.screens.LeccionesScreen

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
    NavHost(navController = navController, startDestination = Screen.Home.route) {
                composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Vocabulario.route) { LeccionesScreen(moduloId = Screen.Vocabulario.route) }
        composable(Screen.Gramatica.route) { LeccionesScreen(moduloId = Screen.Gramatica.route) }
        composable(Screen.ComprensionAuditiva.route) { LeccionesScreen(moduloId = Screen.ComprensionAuditiva.route) }
        composable(Screen.ComprensionOral.route) { LeccionesScreen(moduloId = Screen.ComprensionOral.route) }
        composable(Screen.RutaIA.route) { IAFeedbackScreen() }
    }
}