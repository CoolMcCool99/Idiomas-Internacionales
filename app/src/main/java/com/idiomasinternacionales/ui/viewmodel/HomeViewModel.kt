package com.idiomasinternacionales.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.RutaAprendizaje
import com.idiomasinternacionales.domain.usecase.CreateRutaAprendizajeUseCase
import com.idiomasinternacionales.domain.usecase.GetRutasAprendizajeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Date
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getRutasAprendizajeUseCase: GetRutasAprendizajeUseCase,
    private val createRutaAprendizajeUseCase: CreateRutaAprendizajeUseCase
) : ViewModel() {

    private val _rutasAprendizaje = MutableStateFlow<List<RutaAprendizaje>>(emptyList())
    val rutasAprendizaje: StateFlow<List<RutaAprendizaje>> = _rutasAprendizaje

    init {
        loadRutasAprendizaje()
    }

    fun loadRutasAprendizaje() {
        viewModelScope.launch {
            getRutasAprendizajeUseCase().collect {
                _rutasAprendizaje.value = it
                if (it.isEmpty()) {
                    createDummyRutasAprendizaje()
                }
            }
        }
    }

    private fun createDummyRutasAprendizaje() {
        viewModelScope.launch {
            val now = Date().time
            createRutaAprendizajeUseCase(
                RutaAprendizaje(
                    id = UUID.randomUUID().toString(),
                    nombre = "Inglés Básico",
                    modulos = emptyList(),
                    adaptadaPorIA = false,
                    fechaCreacion = now,
                    fechaUltimaActualizacion = now,
                    feedbackUsuario = null
                )
            )
            createRutaAprendizajeUseCase(
                RutaAprendizaje(
                    id = UUID.randomUUID().toString(),
                    nombre = "Francés Intermedio",
                    modulos = emptyList(),
                    adaptadaPorIA = false,
                    fechaCreacion = now,
                    fechaUltimaActualizacion = now,
                    feedbackUsuario = null
                )
            )
        }
    }
}
