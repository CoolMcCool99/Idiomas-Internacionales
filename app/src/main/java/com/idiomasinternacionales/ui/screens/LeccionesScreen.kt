package com.idiomasinternacionales.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.model.ContenidoLeccion
import com.idiomasinternacionales.model.Leccion
import com.idiomasinternacionales.presentation.viewmodel.LeccionViewModel

@Composable
fun LeccionesScreen(moduloId: String, leccionViewModel: LeccionViewModel = hiltViewModel()) {
    val lecciones by leccionViewModel.lecciones.collectAsState()
    
    LaunchedEffect(moduloId) {
        leccionViewModel.cargarLecciones(moduloId)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Lecciones del módulo")
        LazyColumn {
            items(lecciones) { leccion ->
                when (val contenido = leccion.contenido) {
                    is ContenidoLeccion.Flashcard -> Text(text = "Flashcard: ${contenido.pregunta}")
                    is ContenidoLeccion.OpcionMultiple -> Text(text = "Opción múltiple: ${contenido.pregunta}")
                    is ContenidoLeccion.RellenarHuecos -> Text(text = "Rellenar huecos: ${contenido.frase}")
                    is ContenidoLeccion.Escucha -> Text(text = "Escucha: ${contenido.pregunta}")
                }
            }
        }
    }
}
