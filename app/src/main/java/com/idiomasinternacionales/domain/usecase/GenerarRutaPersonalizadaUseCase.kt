package com.idiomasinternacionales.domain.usecase

import javax.inject.Inject

class GenerarRutaPersonalizadaUseCase @Inject constructor() {
    suspend operator fun invoke(usuarioId: String): String {
        // Placeholder implementation
        return "Ruta generada para $usuarioId"
    }
}
