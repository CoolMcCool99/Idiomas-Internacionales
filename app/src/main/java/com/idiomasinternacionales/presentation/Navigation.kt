package com.idiomasinternacionales.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idiomasinternacionales.presentation.screens.HomeScreen
import androidx.hilt.navigation.compose.hiltViewModel
import com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel
import com.idiomasinternacionales.presentation.screens.ModulosScreen
import com.idiomasinternacionales.presentation.screens.LeccionesScreen

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            val usuarioViewModel: UsuarioViewModel = hiltViewModel()
            usuarioViewModel.cargarUsuarioDemo()
            HomeScreen()
        }
        composable("modulos") {
            ModulosScreen()
        }
        composable("lecciones/{moduloId}") { backStackEntry ->
            val moduloId = backStackEntry.arguments?.getString("moduloId") ?: "1"
            LeccionesScreen(moduloId)
        }
    }
}
