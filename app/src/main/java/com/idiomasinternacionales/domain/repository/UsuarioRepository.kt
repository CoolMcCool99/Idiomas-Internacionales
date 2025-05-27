package com.idiomasinternacionales.domain/repository

import com.idiomasinternacionales.domain.model.Usuario

interface UsuarioRepository {
    suspend fun getUsuario(id: String): Usuario?
    suspend fun saveUsuario(usuario: Usuario)
    suspend fun clearUsuarios()
}
