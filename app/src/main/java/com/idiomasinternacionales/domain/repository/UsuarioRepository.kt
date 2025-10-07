package com.idiomasinternacionales.domain.repository

import com.idiomasinternacionales.model.Usuario
import kotlinx.coroutines.flow.Flow

interface UsuarioRepository {
    suspend fun insertUsuario(usuario: Usuario)
    suspend fun updateUsuario(usuario: Usuario)
    fun getUsuarioById(id: String): Flow<Usuario?>
    suspend fun deleteAllUsuarios()
}