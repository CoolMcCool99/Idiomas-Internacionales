package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Estadisticas
import com.idiomasinternacionales.domain.usecase.GetUsuarioUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamificacionViewModel @Inject constructor(
    private val getUsuario: GetUsuarioUseCase
) : ViewModel() {
    private val _estadisticas = MutableStateFlow<Estadisticas?>(null)
    val estadisticas: StateFlow<Estadisticas?> = _estadisticas

    fun cargarGamificacion(userId: String) {
        viewModelScope.launch {
            getUsuario(userId).collect { usuario ->
                _estadisticas.value = usuario?.estadisticas
            }
        }
    }
}
