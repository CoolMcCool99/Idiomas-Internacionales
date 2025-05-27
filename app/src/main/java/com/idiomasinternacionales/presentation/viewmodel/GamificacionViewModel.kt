package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.GamificacionAvanzada
import com.idiomasinternacionales.domain.usecase.GetGamificacionAvanzadaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamificacionViewModel @Inject constructor(
    private val getGamificacionAvanzada: GetGamificacionAvanzadaUseCase
) : ViewModel() {
    private val _gamificacion = MutableStateFlow<GamificacionAvanzada?>(null)
    val gamificacion: StateFlow<GamificacionAvanzada?> = _gamificacion

    fun cargarGamificacion() {
        viewModelScope.launch {
            _gamificacion.value = getGamificacionAvanzada()
        }
    }
}
