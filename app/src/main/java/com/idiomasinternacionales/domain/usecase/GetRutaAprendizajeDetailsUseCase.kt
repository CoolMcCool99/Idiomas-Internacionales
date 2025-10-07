package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.RutaAprendizaje
import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRutaAprendizajeDetailsUseCase @Inject constructor(private val rutaAprendizajeRepository: RutaAprendizajeRepository) {
    operator fun invoke(rutaId: String): Flow<RutaAprendizaje?> {
        return rutaAprendizajeRepository.getRutaAprendizajeById(rutaId)
    }
}
