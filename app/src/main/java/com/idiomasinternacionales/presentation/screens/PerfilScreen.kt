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
import com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel

@Composable
fun PerfilScreen(perfilViewModel: PerfilViewModel = hiltViewModel()) {
    val perfil by perfilViewModel.perfil.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Perfil de Usuario")
        Text(text = perfil?.usuario?.nombre ?: "Sin datos")
        Text(text = "Puntos: ${perfil?.gamificacion?.puntos ?: 0}")
        Text(text = "Racha: ${perfil?.gamificacion?.racha ?: 0}")
    }
}
