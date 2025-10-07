package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao
import com.idiomasinternacionales.data.local.entities.RutaAprendizajeEntity
import com.idiomasinternacionales.model.RutaAprendizaje
import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RutaAprendizajeRepositoryImpl @Inject constructor(
    private val rutaAprendizajeDao: RutaAprendizajeDao
) : RutaAprendizajeRepository {

    override suspend fun insertRutaAprendizaje(ruta: RutaAprendizaje) {
        rutaAprendizajeDao.insertRutaAprendizaje(ruta.toEntity())
    }

    override suspend fun updateRutaAprendizaje(ruta: RutaAprendizaje) {
        rutaAprendizajeDao.updateRutaAprendizaje(ruta.toEntity())
    }

    override fun getRutaAprendizajeById(rutaId: String): Flow<RutaAprendizaje?> {
        return rutaAprendizajeDao.getRutaAprendizajeById(rutaId).map { it?.toDomain() }
    }

    override fun getAllRutasAprendizaje(): Flow<List<RutaAprendizaje>> {
        return rutaAprendizajeDao.getAllRutasAprendizaje().map { list ->
            list.map { it.toDomain() }
        }
    }
}

fun RutaAprendizaje.toEntity(): RutaAprendizajeEntity {
    return RutaAprendizajeEntity(
        id = this.id,
        nombre = this.nombre,
        adaptadaPorIA = this.adaptadaPorIA,
        fechaCreacion = this.fechaCreacion, // <-- CORREGIDO
        fechaUltimaActualizacion = this.fechaUltimaActualizacion, // <-- CORREGIDO
        feedbackUsuario = this.feedbackUsuario
    )
}

fun RutaAprendizajeEntity.toDomain(): RutaAprendizaje {
    return RutaAprendizaje(
        id = this.id,
        nombre = this.nombre,
        modulos = emptyList(), // Modulos are not stored directly in RutaAprendizajeEntity
        adaptadaPorIA = this.adaptadaPorIA,
        fechaCreacion = this.fechaCreacion, // <-- CORREGIDO
        fechaUltimaActualizacion = this.fechaUltimaActualizacion, // <-- CORREGIDO
        feedbackUsuario = this.feedbackUsuario
    )
}
