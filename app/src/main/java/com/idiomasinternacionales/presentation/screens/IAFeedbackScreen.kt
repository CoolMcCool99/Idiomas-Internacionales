package com.idiomasinternacionales.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.presentation.viewmodel.IAViewModel

@Composable
fun IAFeedbackScreen(iaViewModel: IAViewModel = hiltViewModel()) {
    val feedback by iaViewModel.feedback.collectAsState()
    val ruta by iaViewModel.ruta.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Feedback de IA")
        Button(onClick = { iaViewModel.obtenerFeedbackPronunciacion("audio_demo_url") }) {
            Text("Obtener feedback de pronunciación")
        }
        Text(text = feedback)
        Button(onClick = { iaViewModel.generarRutaPersonalizada("usuario_demo_id") }) {
            Text("Generar ruta personalizada")
        }
        Text(text = ruta)
    }
}
