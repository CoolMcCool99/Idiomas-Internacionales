package com.idiomasinternacionales.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "users")
data class User(
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

enum class Nivel { A1, A2, B1, B2, C1, C2 }

data class Progreso(
    val leccionesCompletadas: Int = 0,
    val palabrasAprendidas: Int = 0,
    val tiempoEstudio: Long = 0,
    val ultimaSesion: LocalDateTime = LocalDateTime.now()
)

data class Preferencias(
    val modoOscuro: Boolean = true,
    val tamañoTexto: Int = 16,
    val idiomaInterfaz: String = "es",
    val notificaciones: Boolean = true
)

data class Estadisticas(
    val diasRacha: Int = 0,
    val puntos: Int = 0,
    val insignias: List<Insignia> = emptyList(),
    val tiempoTotalEstudio: Long = 0
)

data class Insignia(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val fechaObtenida: LocalDateTime
)

data class Notificacion(
    val id: String,
    val mensaje: String,
    val leida: Boolean = false,
    val fecha: LocalDateTime = LocalDateTime.now()
)
