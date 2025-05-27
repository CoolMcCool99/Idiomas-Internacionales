package com.idiomasinternacionales.domain.model

data class PerfilUsuario(
    val usuario: Usuario,
    val configuracionAccesibilidad: ConfiguracionAccesibilidad,
    val gamificacion: Gamificacion
)

data class Gamificacion(
    val puntos: Int,
    val racha: Int,
    val insignias: List<Insignia>,
    val nivel: Nivel
)
