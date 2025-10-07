package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.model.Notificacion
import com.idiomasinternacionales.domain.usecase.CrearNotificacionUseCase
import com.idiomasinternacionales.domain.usecase.GetNotificacionesUseCase
import com.idiomasinternacionales.domain.usecase.MarcarNotificacionLeidaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotificacionViewModel @Inject constructor(
    private val getNotificaciones: GetNotificacionesUseCase,
    private val marcarLeida: MarcarNotificacionLeidaUseCase,
    private val crearNotificacion: CrearNotificacionUseCase
) : ViewModel() {
    private val _notificaciones = MutableStateFlow<List<Notificacion>>(emptyList())
    val notificaciones: StateFlow<List<Notificacion>> = _notificaciones

    fun cargarNotificaciones() {
        viewModelScope.launch {
            getNotificaciones().collect { 
                _notificaciones.value = it
            }
        }
    }

    fun marcarComoLeida(id: String) {
        viewModelScope.launch {
            marcarLeida(id)
            cargarNotificaciones()
        }
    }

    fun crear(notificacion: Notificacion) {
        viewModelScope.launch {
            crearNotificacion(notificacion)
            cargarNotificaciones()
        }
    }
}
