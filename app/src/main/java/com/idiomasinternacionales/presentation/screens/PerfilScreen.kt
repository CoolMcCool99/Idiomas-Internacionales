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
import androidx.compose.ui.res.stringResource
import com.idiomasinternacionales.R
import com.idiomasinternacionales.presentation.viewmodel.PerfilViewModel

@Composable
fun PerfilScreen(perfilViewModel: PerfilViewModel = hiltViewModel()) {
    val perfil by perfilViewModel.perfil.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.user_profile_title))
        Text(text = perfil?.usuario?.nombre ?: stringResource(id = R.string.profile_no_data))
        Text(text = stringResource(id = R.string.profile_points, perfil?.gamificacion?.puntos ?: 0))
        Text(text = stringResource(id = R.string.profile_streak, perfil?.gamificacion?.racha ?: 0))
    }
}
