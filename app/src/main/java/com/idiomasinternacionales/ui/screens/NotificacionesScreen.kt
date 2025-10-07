package com.idiomasinternacionales.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.idiomasinternacionales.model.Notificacion
import com.idiomasinternacionales.presentation.viewmodel.NotificacionViewModel

@Composable
fun NotificacionesScreen(notificacionViewModel: NotificacionViewModel = hiltViewModel()) {
    val notificaciones by notificacionViewModel.notificaciones.collectAsState()
    
    LaunchedEffect(Unit) {
        notificacionViewModel.cargarNotificaciones()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Notificaciones Inteligentes")
        LazyColumn {
            items(notificaciones) { notificacion ->
                Column {
                    Text(text = notificacion.mensaje)
                    if (!notificacion.leida) {
                        Button(onClick = { notificacionViewModel.marcarComoLeida(notificacion.id) }) {
                            Text("Marcar como leída")
                        }
                    }
                }
            }
        }
    }
}
