package com.idiomasinternacionales.domain.model

data class ModuloAprendizaje(
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
