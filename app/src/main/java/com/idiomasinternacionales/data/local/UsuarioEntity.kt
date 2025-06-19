package com.idiomasinternacionales.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.idiomasinternacionales.domain.model.*

@Entity(tableName = "usuarios")
data class UsuarioEntity(
    @PrimaryKey val id: String,
    val nombre: String,
    val email: String,
    val idiomaMeta: String,
    val nivel: String,
    val progreso: String, // Serializado (puede usarse TypeConverters)
    val preferencias: String, // Serializado
    val estadisticas: String, // Serializado
    val notificaciones: String // Serializado
)
