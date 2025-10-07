package com.idiomasinternacionales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idiomasinternacionales.ui.screens.HomeScreen
import com.idiomasinternacionales.ui.screens.RutaAprendizajeDetailsScreen
import com.idiomasinternacionales.ui.screens.LoginScreen
import com.idiomasinternacionales.ui.screens.ModulosScreen
import com.idiomasinternacionales.ui.screens.LeccionesScreen
import com.idiomasinternacionales.ui.theme.IdiomasInternacionalesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IdiomasInternacionalesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login") {
                        composable("login") {
                            LoginScreen(navController = navController)
                        }
                        composable("home") {
                            HomeScreen()
                        }
                        composable("rutaAprendizajeDetails/{rutaId}") { backStackEntry ->
                            val rutaId = backStackEntry.arguments?.getString("rutaId")
                            if (rutaId != null) {
                                RutaAprendizajeDetailsScreen(rutaId = rutaId)
                            }
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
            }
        }
    }
}
