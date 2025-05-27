package com.idiomasinternacionales.domain.model

data class GamificacionAvanzada(
    val puntos: Int,
    val racha: Int,
    val insignias: List<Insignia>,
    val nivel: Nivel,
    val tablaClasificacion: List<RankingUsuario>
)

data class RankingUsuario(
    val usuarioId: String,
    val nombre: String,
    val puntos: Int,
    val posicion: Int
)
