package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.local.UsuarioEntity
import com.idiomasinternacionales.data.remote.ApiService
import com.idiomasinternacionales.domain.model.Usuario

interface UsuarioRepository {
    suspend fun getUsuario(id: String): Usuario?
    suspend fun saveUsuario(usuario: Usuario)
    suspend fun clearUsuarios()
}

class UsuarioRepositoryImpl(
    private val usuarioDao: UsuarioDao,
    private val apiService: ApiService
) : UsuarioRepository {
    override suspend fun getUsuario(id: String): Usuario? {
        // Aquí se puede combinar datos locales y remotos
        val entity = usuarioDao.getUsuarioById(id)
        // TODO: Mapear entity a Usuario
        return null
    }

    override suspend fun saveUsuario(usuario: Usuario) {
        // TODO: Mapear Usuario a UsuarioEntity y guardar
    }

    override suspend fun clearUsuarios() {
        usuarioDao.deleteAllUsuarios()
    }
}
