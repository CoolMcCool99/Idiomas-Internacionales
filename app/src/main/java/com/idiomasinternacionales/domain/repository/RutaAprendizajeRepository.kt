package com.idiomasinternacionales.domain.repository

import com.idiomasinternacionales.model.RutaAprendizaje
import kotlinx.coroutines.flow.Flow

interface RutaAprendizajeRepository {
    suspend fun insertRutaAprendizaje(ruta: RutaAprendizaje)
    suspend fun updateRutaAprendizaje(ruta: RutaAprendizaje)
    fun getRutaAprendizajeById(rutaId: String): Flow<RutaAprendizaje?>
    fun getAllRutasAprendizaje(): Flow<List<RutaAprendizaje>>
}
