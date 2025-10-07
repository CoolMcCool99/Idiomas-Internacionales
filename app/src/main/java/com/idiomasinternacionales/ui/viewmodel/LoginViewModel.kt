package com.idiomasinternacionales.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Nivel
import com.idiomasinternacionales.model.Preferencias
import com.idiomasinternacionales.model.Progreso
import com.idiomasinternacionales.model.Estadisticas
import com.idiomasinternacionales.model.Notificacion
import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.usecase.CreateUsuarioUseCase
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val createUsuarioUseCase: CreateUsuarioUseCase,
    private val getUsuarioUseCase: GetUsuarioUseCase
) : ViewModel() {

    private val _loginState = MutableStateFlow<LoginState>(LoginState.Loading)
    val loginState: StateFlow<LoginState> = _loginState

    init {
        viewModelScope.launch {
            val user = getUsuarioUseCase("default_user_id").firstOrNull()
            if (user == null) {
                createUsuarioUseCase(createDefaultUser())
            }
            _loginState.value = LoginState.Success
        }
    }

    private fun createDefaultUser(): Usuario {
        return Usuario(
            id = "default_user_id",
            nombre = "Usuario por Defecto",
            email = "default@example.com",
            idiomaMeta = "Inglés",
            nivel = Nivel.A1,
            progreso = Progreso(0, 0, 0),
            preferencias = Preferencias("normal", emptyList(), true),
            estadisticas = Estadisticas(0, 0, emptyList(), 0L),
            notificaciones = emptyList()
        )
    }
}

sealed class LoginState {
    object Loading : LoginState()
    object Success : LoginState()
}
