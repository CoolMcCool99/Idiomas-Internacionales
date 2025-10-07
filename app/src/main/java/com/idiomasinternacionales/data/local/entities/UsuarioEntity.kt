package com.idiomasinternacionales.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.idiomasinternacionales.model.Nivel
import com.idiomasinternacionales.model.Progreso
import com.idiomasinternacionales.model.Preferencias
import com.idiomasinternacionales.model.Estadisticas
import com.idiomasinternacionales.model.Notificacion

@Entity(tableName = "usuarios")
data class UsuarioEntity(
    @PrimaryKey val id: String,
    val nombre: String,
    val email: String,
    val idiomaMeta: String,
    val nivel: Nivel,
    val progreso: Progreso,
    val preferencias: Preferencias,
    val estadisticas: Estadisticas,
    val notificaciones: List<Notificacion>
)
