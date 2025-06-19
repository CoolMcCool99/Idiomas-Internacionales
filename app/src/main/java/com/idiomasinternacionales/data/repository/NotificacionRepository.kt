package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.domain.model.NotificacionInteligente

interface NotificacionRepository {
    suspend fun getNotificaciones(): List<NotificacionInteligente>
    suspend fun marcarComoLeida(id: String)
    suspend fun crearNotificacion(notificacion: NotificacionInteligente)
}

class NotificacionRepositoryImpl : NotificacionRepository {
    private val notificaciones = mutableListOf<NotificacionInteligente>()
    override suspend fun getNotificaciones(): List<NotificacionInteligente> = notificaciones
    override suspend fun marcarComoLeida(id: String) {
        notificaciones.find { it.id == id }?.let { n ->
            notificaciones[notificaciones.indexOf(n)] = n.copy(leida = true)
        }
    }
    override suspend fun crearNotificacion(notificacion: NotificacionInteligente) {
        notificaciones.add(notificacion)
    }
}
