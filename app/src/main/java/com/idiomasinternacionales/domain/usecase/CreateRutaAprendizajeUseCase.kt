package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.RutaAprendizaje
import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository
import javax.inject.Inject

class CreateRutaAprendizajeUseCase @Inject constructor(private val rutaAprendizajeRepository: RutaAprendizajeRepository) {
    suspend operator fun invoke(ruta: RutaAprendizaje) {
        rutaAprendizajeRepository.insertRutaAprendizaje(ruta)
    }
}
