package com.idiomasinternacionales.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.idiomasinternacionales.domain.model.Estadisticas
import com.idiomasinternacionales.domain.model.Nivel
import com.idiomasinternacionales.domain.model.Notificacion
import com.idiomasinternacionales.domain.model.Preferencias
import com.idiomasinternacionales.domain.model.Progreso

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
