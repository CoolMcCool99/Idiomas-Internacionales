package com.idiomasinternacionales.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.idiomasinternacionales.ui.viewmodel.RutaAprendizajeDetailsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RutaAprendizajeDetailsScreen(
    rutaId: String,
    viewModel: RutaAprendizajeDetailsViewModel = hiltViewModel()
) {
    val rutaAprendizajeDetails by viewModel.rutaAprendizajeDetails.collectAsState()

    LaunchedEffect(rutaId) {
        viewModel.loadRutaAprendizajeDetails(rutaId)
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(rutaAprendizajeDetails?.nombre ?: "") })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "ID: ${rutaAprendizajeDetails?.id ?: ""}")
            Text(text = "Adaptada por IA: ${rutaAprendizajeDetails?.adaptadaPorIA ?: ""}")
            Text(text = "Fecha Creación: ${rutaAprendizajeDetails?.fechaCreacion ?: ""}")
            Text(text = "Última Actualización: ${rutaAprendizajeDetails?.fechaUltimaActualizacion ?: ""}")
            Text(text = "Feedback: ${rutaAprendizajeDetails?.feedbackUsuario ?: ""}")
        }
    }
}
