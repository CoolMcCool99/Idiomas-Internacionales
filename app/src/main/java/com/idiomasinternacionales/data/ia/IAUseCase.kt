package com.idiomasinternacionales.data.ia

import com.idiomasinternacionales.model.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class IAUseCase(private val iaService: IAService) {
    suspend fun obtenerFeedbackPronunciacion(audioUrl: String): String =
        withContext(Dispatchers.IO) { iaService.obtenerFeedbackPronunciacion(audioUrl) }

    suspend fun generarRutaPersonalizada(usuario: Usuario): String =
        withContext(Dispatchers.IO) { iaService.generarRutaPersonalizada(usuario) }
}
