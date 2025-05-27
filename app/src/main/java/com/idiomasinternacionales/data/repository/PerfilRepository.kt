package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.domain.model.PerfilUsuario

interface PerfilRepository {
    suspend fun getPerfilUsuario(id: String): PerfilUsuario?
    suspend fun savePerfilUsuario(perfil: PerfilUsuario)
}

class PerfilRepositoryImpl : PerfilRepository {
    override suspend fun getPerfilUsuario(id: String): PerfilUsuario? {
        // TODO: Implementar persistencia real o integración remota
        return null
    }
    override suspend fun savePerfilUsuario(perfil: PerfilUsuario) {
        // TODO: Implementar guardado real
    }
}
