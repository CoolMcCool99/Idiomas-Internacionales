package com.idiomasinternacionales.model

import java.io.Serializable

/**
 * Enum que representa los niveles de usuario según el MCER.
 * A1, A2, B1, B2, C1, C2.
 */
enum class Nivel { A1, A2, B1, B2, C1, C2 }

/**
 * Enum que representa los tipos de módulo disponibles en la app.
 */
enum class TipoModulo { VOCABULARIO, GRAMATICA, COMPRENSION_AUDITIVA, ORAL }

/**
 * Enum que representa los tipos de lección disponibles.
 */
enum class TipoLeccion { FLASHCARD, OPCION_MULTIPLE, RELLENAR_HUECOS, ESCUCHA }

/**
 * Modelo principal de usuario.
 * @property id Identificador único.
 * @property nombre Nombre del usuario.
 * @property email Correo electrónico.
 * @property idiomaMeta Idioma objetivo.
 * @property nivel Nivel actual del usuario.
 * @property progreso Progreso global.
 * @property preferencias Preferencias de aprendizaje.
 * @property estadisticas Estadísticas de uso y logros.
 * @property notificaciones Lista de notificaciones.
 */
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
) : Serializable

/**
 * Estadísticas de uso y gamificación del usuario.
 */
data class Estadisticas(
    val diasRacha: Int,
    val puntos: Int,
    val insignias: List<Insignia>,
    val tiempoTotalEstudio: Long // en minutos
) : Serializable

/**
 * Insignia obtenida por el usuario.
 */
data class Insignia(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val fechaObtenida: Long
) : Serializable

/**
 * Notificación enviada al usuario.
 */
data class Notificacion(
    val id: String,
    val mensaje: String,
    val leida: Boolean,
    val fecha: Long
) : Serializable

/**
 * Configuración de accesibilidad del usuario.
 */
data class ConfiguracionAccesibilidad(
    val modoOscuro: Boolean,
    val fuenteDislexia: Boolean,
    val tamanoTexto: Float
) : Serializable

/**
 * Preferencias de aprendizaje del usuario.
 */
data class Preferencias(
    val ritmo: String, // rápido, normal, lento
    val temasFavoritos: List<String>,
    val notificacionesActivas: Boolean
) : Serializable

/**
 * Progreso global del usuario.
 */
data class Progreso(
    val porcentaje: Int,
    val modulosCompletados: Int,
    val totalModulos: Int
) : Serializable

/**
 * Ruta de aprendizaje personalizada.
 */
data class RutaAprendizaje(
    val id: String,
    val nombre: String,
    val modulos: List<Modulo>,
    val adaptadaPorIA: Boolean,
    val fechaCreacion: Long,
    val fechaUltimaActualizacion: Long,
    val feedbackUsuario: String?
) : Serializable

/**
 * Módulo de aprendizaje.
 */
data class Modulo(
    val id: String,
    val tipo: TipoModulo,
    val lecciones: List<Leccion>,
    val progreso: ProgresoModulo,
    val descripcion: String
) : Serializable

/**
 * Progreso dentro de un módulo.
 */
data class ProgresoModulo(
    val porcentaje: Int,
    val leccionesCompletadas: Int,
    val totalLecciones: Int
) : Serializable

/**
 * Representa el contenido de una lección.
 */
sealed class ContenidoLeccion : Serializable {
    /** Flashcard: pregunta/respuesta simple. */
    data class Flashcard(val pregunta: String, val respuesta: String) : ContenidoLeccion()
    /** Opción múltiple. */
    data class OpcionMultiple(val pregunta: String, val opciones: List<String>, val respuestaCorrecta: Int) : ContenidoLeccion()
    /** Ejercicio de rellenar huecos. */
    data class RellenarHuecos(val frase: String, val huecos: List<String>, val respuestas: List<String>) : ContenidoLeccion()
    /** Ejercicio de escucha. */
    data class Escucha(val urlAudio: String, val pregunta: String, val respuesta: String) : ContenidoLeccion()
}

/**
 * Lección individual dentro de un módulo.
 */
data class Leccion(
    val id: String,
    val tipo: TipoLeccion,
    val contenido: ContenidoLeccion,
    val retroalimentacion: String?,
    val completada: Boolean,
    val fechaCompletada: Long?
) : Serializable
