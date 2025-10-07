package com.idiomasinternacionales.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rutas_aprendizaje")
data class RutaAprendizajeEntity(
    @PrimaryKey val id: String,
    val nombre: String,
    val adaptadaPorIA: Boolean,
    val fechaCreacion: Long,
    val fechaUltimaActualizacion: Long,
    val feedbackUsuario: String?
)
