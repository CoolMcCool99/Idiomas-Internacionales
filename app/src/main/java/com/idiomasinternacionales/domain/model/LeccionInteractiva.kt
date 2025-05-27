package com.idiomasinternacionales.domain/model

sealed class LeccionInteractiva {
    data class Flashcard(val id: String, val pregunta: String, val respuesta: String) : LeccionInteractiva()
    data class OpcionMultiple(val id: String, val pregunta: String, val opciones: List<String>, val respuestaCorrecta: Int) : LeccionInteractiva()
    data class RellenarHuecos(val id: String, val frase: String, val huecos: List<String>, val respuestas: List<String>) : LeccionInteractiva()
    data class Escucha(val id: String, val urlAudio: String, val pregunta: String, val respuesta: String) : LeccionInteractiva()
}
