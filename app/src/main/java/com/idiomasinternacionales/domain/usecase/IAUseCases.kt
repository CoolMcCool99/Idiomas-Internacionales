package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.ia.IAService

class ObtenerFeedbackPronunciacionUseCase(private val iaService: IAService) {
    suspend operator fun invoke(audioUrl: String): String = iaService.obtenerFeedbackPronunciacion(audioUrl)
}

class GenerarRutaPersonalizadaUseCase(private val iaService: IAService) {
    suspend operator fun invoke(usuarioId: String): String = iaService.generarRutaPersonalizada(usuarioId)
}
