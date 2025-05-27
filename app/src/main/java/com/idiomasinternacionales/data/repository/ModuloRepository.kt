package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.domain.model.ModuloAprendizaje
import com.idiomasinternacionales.domain.model.TipoModulo

interface ModuloRepository {
    suspend fun getModulos(): List<ModuloAprendizaje>
    suspend fun getModuloPorTipo(tipo: TipoModulo): ModuloAprendizaje?
}

class ModuloRepositoryImpl : ModuloRepository {
    override suspend fun getModulos(): List<ModuloAprendizaje> {
        // TODO: Implementar persistencia real o integración remota
        return listOf() // Dummy
    }
    override suspend fun getModuloPorTipo(tipo: TipoModulo): ModuloAprendizaje? {
        // TODO: Implementar búsqueda real
        return null
    }
}
