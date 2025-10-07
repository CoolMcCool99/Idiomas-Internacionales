package com.idiomasinternacionales.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.idiomasinternacionales.presentation.viewmodel.UsuarioViewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.idiomasinternacionales.R

@Composable
fun HomeScreen(usuarioViewModel: UsuarioViewModel = hiltViewModel()) {
    val usuario by usuarioViewModel.usuario.collectAsState()
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        when {
            usuario == null -> CircularProgressIndicator() // Muestra el indicador de carga
            else -> Text(text = usuario?.nombre ?: stringResource(id = R.string.welcome_message))
        }
    }
}
