package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.domain.model.GamificacionAvanzada

interface GamificacionRepository {
    suspend fun getGamificacionAvanzada(): GamificacionAvanzada
}

class GamificacionRepositoryImpl : GamificacionRepository {
    override suspend fun getGamificacionAvanzada(): GamificacionAvanzada {
        // Dummy data para desarrollo
        return GamificacionAvanzada(
            puntos = 1200,
            racha = 15,
            insignias = listOf(),
            nivel = com.idiomasinternacionales.domain.model.Nivel.B2,
            tablaClasificacion = listOf()
        )
    }
}
