package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.repository.GamificacionRepository
import com.idiomasinternacionales.domain.model.GamificacionAvanzada

class GetGamificacionAvanzadaUseCase(private val repository: GamificacionRepository) {
    suspend operator fun invoke(): GamificacionAvanzada = repository.getGamificacionAvanzada()
}
