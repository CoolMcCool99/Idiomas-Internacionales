package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.dao.UsuarioDao
import com.idiomasinternacionales.data.local.entities.UsuarioEntity
import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.repository.UsuarioRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UsuarioRepositoryImpl @Inject constructor(
    private val usuarioDao: UsuarioDao
) : UsuarioRepository {

    override suspend fun insertUsuario(usuario: Usuario) {
        usuarioDao.insertUsuario(usuario.toEntity())
    }

    override suspend fun updateUsuario(usuario: Usuario) {
        usuarioDao.updateUsuario(usuario.toEntity())
    }

    override fun getUsuarioById(id: String): Flow<Usuario?> {
        return usuarioDao.getUsuarioById(id).map { it?.toDomain() }
    }

    override suspend fun deleteAllUsuarios() {
        usuarioDao.deleteAllUsuarios()
    }
}

fun Usuario.toEntity(): UsuarioEntity {
    return UsuarioEntity(
        id = this.id,
        nombre = this.nombre,
        email = this.email,
        idiomaMeta = this.idiomaMeta,
        nivel = this.nivel,
        progreso = this.progreso,
        preferencias = this.preferencias,
        estadisticas = this.estadisticas,
        notificaciones = this.notificaciones
    )
}

fun UsuarioEntity.toDomain(): Usuario {
    return Usuario(
        id = this.id,
        nombre = this.nombre,
        email = this.email,
        idiomaMeta = this.idiomaMeta,
        nivel = this.nivel,
        progreso = this.progreso,
        preferencias = this.preferencias,
        estadisticas = this.estadisticas,
        notificaciones = this.notificaciones
    )
}
