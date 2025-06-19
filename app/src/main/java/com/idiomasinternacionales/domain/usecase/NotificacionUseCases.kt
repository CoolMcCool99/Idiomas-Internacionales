package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.repository.NotificacionRepository
import com.idiomasinternacionales.domain.model.NotificacionInteligente

class GetNotificacionesUseCase(private val repository: NotificacionRepository) {
    suspend operator fun invoke(): List<NotificacionInteligente> = repository.getNotificaciones()
}

class MarcarNotificacionLeidaUseCase(private val repository: NotificacionRepository) {
    suspend operator fun invoke(id: String) = repository.marcarComoLeida(id)
}

class CrearNotificacionUseCase(private val repository: NotificacionRepository) {
    suspend operator fun invoke(notificacion: NotificacionInteligente) = repository.crearNotificacion(notificacion)
}
