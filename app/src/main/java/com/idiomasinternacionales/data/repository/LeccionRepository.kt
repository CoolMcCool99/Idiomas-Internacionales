package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.domain.model.LeccionInteractiva

interface LeccionRepository {
    suspend fun getLeccionesPorModulo(moduloId: String): List<LeccionInteractiva>
}

class LeccionRepositoryImpl : LeccionRepository {
    override suspend fun getLeccionesPorModulo(moduloId: String): List<LeccionInteractiva> {
        // TODO: Implementar persistencia real o integración remota
        return listOf(
            LeccionInteractiva.Flashcard("1", "¿Cómo se dice 'perro' en inglés?", "dog"),
            LeccionInteractiva.OpcionMultiple("2", "Selecciona el plural de 'child'", listOf("childs", "children", "childes"), 1),
            LeccionInteractiva.RellenarHuecos("3", "I ___ to school every day.", listOf("go"), listOf("go")),
            LeccionInteractiva.Escucha("4", "https://audio.ejemplo.com/hello.mp3", "¿Qué palabra escuchas?", "hello")
        )
    }
}
