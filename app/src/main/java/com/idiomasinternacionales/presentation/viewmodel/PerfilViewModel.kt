package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase
import com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PerfilViewModel @Inject constructor(
    private val getUsuario: GetUsuarioUseCase,
    private val saveUsuario: SaveUsuarioUseCase
) : ViewModel() {
    private val _perfil = MutableStateFlow<Usuario?>(null)
    val perfil: StateFlow<Usuario?> = _perfil

    fun cargarPerfil(id: String) {
        viewModelScope.launch {
            getUsuario(id).collect { usuario ->
                _perfil.value = usuario
            }
        }
    }

    fun guardarPerfil(perfil: Usuario) {
        viewModelScope.launch {
            saveUsuario(perfil)
            _perfil.value = perfil
        }
    }
}
