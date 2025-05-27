package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.local.UsuarioEntity
import com.idiomasinternacionales.domain.model.Usuario

interface UsuarioRepository {
    suspend fun getUsuario(id: String): Usuario?
    suspend fun saveUsuario(usuario: Usuario)
    suspend fun clearUsuarios()
}

class UsuarioRepositoryImpl(private val usuarioDao: UsuarioDao) : UsuarioRepository {
    override suspend fun getUsuario(id: String): Usuario? {
        val entity = usuarioDao.getUsuarioById(id)
        // Aquí se debe mapear UsuarioEntity a Usuario (requiere TypeConverters para objetos complejos)
        return null // Implementar mapeo real
    }

    override suspend fun saveUsuario(usuario: Usuario) {
        // Mapear Usuario a UsuarioEntity (requiere TypeConverters)
        // usuarioDao.insertUsuario(entity)
    }

    override suspend fun clearUsuarios() {
        usuarioDao.deleteAllUsuarios()
    }
}
