package com.idiomasinternacionales.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idiomasinternacionales.domain.model.NotificacionInteligente
import com.idiomasinternacionales.domain.usecase.CrearNotificacionUseCase
import com.idiomasinternacionales.domain.usecase.GetNotificacionesUseCase
import com.idiomasinternacionales.domain.usecase.MarcarNotificacionLeidaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotificacionViewModel @Inject constructor(
    private val getNotificaciones: GetNotificacionesUseCase,
    private val marcarLeida: MarcarNotificacionLeidaUseCase,
    private val crearNotificacion: CrearNotificacionUseCase
) : ViewModel() {
    private val _notificaciones = MutableStateFlow<List<NotificacionInteligente>>(emptyList())
    val notificaciones: StateFlow<List<NotificacionInteligente>> = _notificaciones

    fun cargarNotificaciones() {
        viewModelScope.launch {
            _notificaciones.value = getNotificaciones()
        }
    }

    fun marcarComoLeida(id: String) {
        viewModelScope.launch {
            marcarLeida(id)
            cargarNotificaciones()
        }
    }

    fun crear(notificacion: NotificacionInteligente) {
        viewModelScope.launch {
            crearNotificacion(notificacion)
            cargarNotificaciones()
        }
    }
}
