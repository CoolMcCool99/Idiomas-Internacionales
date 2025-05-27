package com.idiomasinternacionales.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.domain.model.LeccionInteractiva
import com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel

@Composable
fun LeccionesScreen(moduloId: String, leccionViewModel: LeccionViewModel = hiltViewModel()) {
    val lecciones by leccionViewModel.lecciones.collectAsState()
    leccionViewModel.cargarLecciones(moduloId)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Lecciones del módulo")
        LazyColumn {
            items(lecciones) { leccion ->
                when (leccion) {
                    is LeccionInteractiva.Flashcard -> Text(text = "Flashcard: ${leccion.pregunta}")
                    is LeccionInteractiva.OpcionMultiple -> Text(text = "Opción múltiple: ${leccion.pregunta}")
                    is LeccionInteractiva.RellenarHuecos -> Text(text = "Rellenar huecos: ${leccion.frase}")
                    is LeccionInteractiva.Escucha -> Text(text = "Escucha: ${leccion.pregunta}")
                }
            }
        }
    }
}
