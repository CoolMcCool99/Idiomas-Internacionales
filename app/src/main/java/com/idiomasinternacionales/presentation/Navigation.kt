package com.idiomasinternacionales.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idiomasinternacionales.presentation.screens.HomeScreen
import androidx.hilt.navigation.compose.hiltViewModel
import com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            val usuarioViewModel: UsuarioViewModel = hiltViewModel()
            usuarioViewModel.cargarUsuarioDemo()
            HomeScreen()
        }
    }
}
