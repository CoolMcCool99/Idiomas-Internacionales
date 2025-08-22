package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.local.UsuarioEntity
import com.idiomasinternacionales.data.remote.ApiService
import com.idiomasinternacionales.domain.model.Usuario
import com.idiomasinternacionales.domain.repository.UsuarioRepository

/**
 * Implementación de [UsuarioRepository] usando Room y servicios remotos.
 * @param usuarioDao DAO de Room para usuarios.
 * @param apiService Servicio remoto para sincronización.
 */
class UsuarioRepositoryImpl(
    private val usuarioDao: UsuarioDao,
    private val apiService: ApiService
) : UsuarioRepository {

    override suspend fun getUsuario(id: String): Usuario? {
        // Room se encarga de la conversión gracias a los TypeConverters
        val entity = usuarioDao.getUsuarioById(id) ?: return null
        return entityToUsuario(entity)
    }

    override suspend fun saveUsuario(usuario: Usuario) {
        // Room se encarga de la conversión gracias a los TypeConverters
        usuarioDao.insertUsuario(usuarioToEntity(usuario))
    }

    override suspend fun clearUsuarios() {
        usuarioDao.deleteAllUsuarios()
    }

    // Mappers simples entre el modelo de Dominio y la Entidad de la BBDD
    private fun entityToUsuario(entity: UsuarioEntity): Usuario = Usuario(
        id = entity.id,
        nombre = entity.nombre,
        email = entity.email,
        idiomaMeta = entity.idiomaMeta,
        nivel = entity.nivel,
        progreso = entity.progreso,
        preferencias = entity.preferencias,
        estadisticas = entity.estadisticas,
        notificaciones = entity.notificaciones
    )

    private fun usuarioToEntity(usuario: Usuario): UsuarioEntity = UsuarioEntity(
        id = usuario.id,
        nombre = usuario.nombre,
        email = usuario.email,
        idiomaMeta = usuario.idiomaMeta,
        nivel = usuario.nivel,
        progreso = usuario.progreso,
        preferencias = usuario.preferencias,
        estadisticas = usuario.estadisticas,
        notificaciones = usuario.notificaciones
    )
}