package com.idiomasinternacionales.domain.model

data class NotificacionInteligente(
    val id: String,
    val mensaje: String,
    val tipo: TipoNotificacion,
    val fecha: Long,
    val leida: Boolean,
    val personalizadaPorIA: Boolean
)

enum class TipoNotificacion {
    RECORDATORIO, PROGRESO, RECOMENDACION, OTRO
}
