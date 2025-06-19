package com.idiomasinternacionales.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.presentation.viewmodel.GamificacionViewModel

@Composable
fun GamificacionScreen(gamificacionViewModel: GamificacionViewModel = hiltViewModel()) {
    val gamificacion by gamificacionViewModel.gamificacion.collectAsState()
    gamificacionViewModel.cargarGamificacion()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Gamificación Avanzada")
        Text(text = "Puntos: ${gamificacion?.puntos ?: 0}")
        Text(text = "Racha: ${gamificacion?.racha ?: 0}")
        Text(text = "Nivel: ${gamificacion?.nivel ?: "-"}")
        Text(text = "Ranking: ${gamificacion?.tablaClasificacion?.size ?: 0} usuarios")
    }
}
