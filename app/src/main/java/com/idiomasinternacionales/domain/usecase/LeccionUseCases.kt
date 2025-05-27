package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.repository.LeccionRepository
import com.idiomasinternacionales.domain.model.LeccionInteractiva

class GetLeccionesPorModuloUseCase(private val repository: LeccionRepository) {
    suspend operator fun invoke(moduloId: String): List<LeccionInteractiva> = repository.getLeccionesPorModulo(moduloId)
}
