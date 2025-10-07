package com.idiomasinternacionales.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel

@Composable
fun GamificacionScreen(gamificacionViewModel: GamificacionViewModel = hiltViewModel()) {
    val estadisticas by gamificacionViewModel.estadisticas.collectAsState()
    
    LaunchedEffect(Unit) {
        gamificacionViewModel.cargarGamificacion("demo_user")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Gamificación Avanzada")
        Text(text = "Puntos: ${estadisticas?.puntos ?: 0}")
        Text(text = "Racha: ${estadisticas?.diasRacha ?: 0}")
        // Text(text = "Nivel: ${gamificacion?.nivel ?: "-"}") // Property does not exist
        // Text(text = "Ranking: ${gamificacion?.tablaClasificacion?.size ?: 0} usuarios") // Property does not exist
    }
}
