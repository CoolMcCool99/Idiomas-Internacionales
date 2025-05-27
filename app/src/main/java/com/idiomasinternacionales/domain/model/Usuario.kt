package com.idiomasinternacionales.domain.model

data class Usuario(
    val id: String,
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

data class Estadisticas(
    val diasRacha: Int,
    val puntos: Int,
    val insignias: List<Insignia>,
    val tiempoTotalEstudio: Long
)

data class Insignia(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val fechaObtenida: Long
)

data class Notificacion(
    val id: String,
    val mensaje: String,
    val leida: Boolean,
    val fecha: Long
)

data class ConfiguracionAccesibilidad(
    val modoOscuro: Boolean,
    val fuenteDislexia: Boolean,
    val tamanoTexto: Float
)

data class RutaAprendizaje(
    val id: String,
    val nombre: String,
    val modulos: List<Modulo>,
    val adaptadaPorIA: Boolean,
    val fechaCreacion: Long,
    val fechaUltimaActualizacion: Long,
    val feedbackUsuario: String?
)

data class Modulo(
    val id: String,
    val tipo: TipoModulo,
    val lecciones: List<Leccion>,
    val progreso: ProgresoModulo,
    val descripcion: String
)

enum class TipoModulo { VOCABULARIO, GRAMATICA, COMPRENSION_AUDITIVA, ORAL }

data class ProgresoModulo(
    val porcentaje: Int,
    val leccionesCompletadas: Int,
    val totalLecciones: Int
)

data class Leccion(
    val id: String,
    val tipo: TipoLeccion,
    val contenido: ContenidoLeccion,
    val retroalimentacion: String?,
    val completada: Boolean,
    val fechaCompletada: Long?
)

enum class TipoLeccion { FLASHCARD, OPCION_MULTIPLE, RELLENAR_HUECOS, ESCUCHA }

sealed class ContenidoLeccion {
    data class Flashcard(val pregunta: String, val respuesta: String): ContenidoLeccion()
    data class OpcionMultiple(val pregunta: String, val opciones: List<String>, val respuestaCorrecta: Int): ContenidoLeccion()
    data class RellenarHuecos(val frase: String, val huecos: List<String>, val respuestas: List<String>): ContenidoLeccion()
    data class Escucha(val urlAudio: String, val pregunta: String, val respuesta: String): ContenidoLeccion()
}

data class Preferencias(
    val ritmo: String,
    val temasFavoritos: List<String>,
    val notificacionesActivas: Boolean
)

data class Progreso(
    val porcentaje: Int,
    val modulosCompletados: Int,
    val totalModulos: Int
)
