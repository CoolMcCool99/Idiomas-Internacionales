package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.usecase.GenerarRutaPersonalizadaUseCase
import com.idiomasinternacionales.domain.usecase.ObtenerFeedbackPronunciacionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IAViewModel @Inject constructor(
    private val obtenerFeedback: ObtenerFeedbackPronunciacionUseCase,
    private val generarRuta: GenerarRutaPersonalizadaUseCase
) : ViewModel() {
    private val _feedback = MutableStateFlow("")
    val feedback: StateFlow<String> = _feedback
    private val _ruta = MutableStateFlow("")
    val ruta: StateFlow<String> = _ruta

    fun obtenerFeedbackPronunciacion(audioUrl: String) {
        viewModelScope.launch {
            _feedback.value = obtenerFeedback(audioUrl)
        }
    }

    fun generarRutaPersonalizada(usuarioId: String) {
        viewModelScope.launch {
            _ruta.value = generarRuta(usuarioId)
        }
    }
}
