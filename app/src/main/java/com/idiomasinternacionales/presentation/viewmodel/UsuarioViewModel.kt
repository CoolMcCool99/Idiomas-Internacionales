package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase
import com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase
import com.idiomasinternacionales.model.Estadisticas
import com.idiomasinternacionales.model.Insignia
import com.idiomasinternacionales.model.Nivel
import com.idiomasinternacionales.model.Notificacion
import com.idiomasinternacionales.model.Preferencias
import com.idiomasinternacionales.model.Progreso
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsuarioViewModel @Inject constructor(
    private val getUsuario: GetUsuarioUseCase,
    private val saveUsuario: SaveUsuarioUseCase
) : ViewModel() {
    private val _usuario = MutableStateFlow<Usuario?>(null)
    val usuario: StateFlow<Usuario?> = _usuario

    fun cargarUsuario(id: String) {
        viewModelScope.launch {
            getUsuario(id).collect {
                _usuario.value = it
            }
        }
    }

    fun guardarUsuario(usuario: Usuario) {
        viewModelScope.launch {
            saveUsuario(usuario)
            _usuario.value = usuario
        }
    }

    fun cargarUsuarioDemo() {
        viewModelScope.launch {
            _usuario.value = Usuario(
                id = "demo_user",
                nombre = "Usuario Demo",
                email = "demo@example.com",
                idiomaMeta = "Inglés",
                nivel = Nivel.B1,
                progreso = Progreso(50, 2, 4),
                preferencias = Preferencias("normal", listOf("tecnologia", "viajes"), true),
                estadisticas = Estadisticas(10, 1500, listOf(Insignia("insignia_1", "Madrugador", "Completaste 10 lecciones por la mañana", System.currentTimeMillis())), 120),
                notificaciones = listOf(Notificacion("notif_1", "¡Sigue así!", false, System.currentTimeMillis()))
            )
        }
    }
}
