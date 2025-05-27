package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.DummyData
import com.idiomasinternacionales.domain.model.Usuario
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase
import com.idiomasinternacionales.domain.usecase.SaveUsuarioUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
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
            _usuario.value = getUsuario(id)
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
            _usuario.value = DummyData.usuarioDemo
        }
    }
}
