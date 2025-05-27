package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.PerfilUsuario
import com.idiomasinternacionales.domain.usecase.GetPerfilUsuarioUseCase
import com.idiomasinternacionales.domain.usecase.SavePerfilUsuarioUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PerfilViewModel @Inject constructor(
    private val getPerfil: GetPerfilUsuarioUseCase,
    private val savePerfil: SavePerfilUsuarioUseCase
) : ViewModel() {
    private val _perfil = MutableStateFlow<PerfilUsuario?>(null)
    val perfil: StateFlow<PerfilUsuario?> = _perfil

    fun cargarPerfil(id: String) {
        viewModelScope.launch {
            _perfil.value = getPerfil(id)
        }
    }

    fun guardarPerfil(perfil: PerfilUsuario) {
        viewModelScope.launch {
            savePerfil(perfil)
            _perfil.value = perfil
        }
    }
}
