package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.repository.ModuloRepository
import com.idiomasinternacionales.domain.model.ModuloAprendizaje
import com.idiomasinternacionales.domain.model.TipoModulo

class GetModulosUseCase(private val repository: ModuloRepository) {
    suspend operator fun invoke(): List<ModuloAprendizaje> = repository.getModulos()
}

class GetModuloPorTipoUseCase(private val repository: ModuloRepository) {
    suspend operator fun invoke(tipo: TipoModulo): ModuloAprendizaje? = repository.getModuloPorTipo(tipo)
}
