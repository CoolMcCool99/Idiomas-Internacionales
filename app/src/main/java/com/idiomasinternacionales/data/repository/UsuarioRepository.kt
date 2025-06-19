package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.local.UsuarioEntity
import com.idiomasinternacionales.data.remote.ApiService
import com.idiomasinternacionales.model.*
import com.squareup.moshi.Moshi

/**
 * Repositorio para la gestión de usuarios.
 */
interface UsuarioRepository {
    /** Obtiene un usuario por su id. */
    suspend fun getUsuario(id: String): Usuario?
    /** Guarda o actualiza un usuario. */
    suspend fun saveUsuario(usuario: Usuario)
    /** Elimina todos los usuarios locales. */
    suspend fun clearUsuarios()
}

/**
 * Implementación de [UsuarioRepository] usando Room y servicios remotos.
 * @param usuarioDao DAO de Room para usuarios.
 * @param apiService Servicio remoto para sincronización.
 */
class UsuarioRepositoryImpl(
    private val usuarioDao: UsuarioDao,
    private val apiService: ApiService
) : UsuarioRepository {
    private val moshi = Moshi.Builder().build()

    override suspend fun getUsuario(id: String): Usuario? {
        val entity = usuarioDao.getUsuarioById(id) ?: return null
        return entityToUsuario(entity)
    }

    override suspend fun saveUsuario(usuario: Usuario) {
        usuarioDao.insertUsuario(usuarioToEntity(usuario))
    }

    override suspend fun clearUsuarios() {
        usuarioDao.deleteAllUsuarios()
    }

    // Mappers
    /**
     * Convierte una entidad Room a modelo de dominio [Usuario].
     */
    private fun entityToUsuario(entity: UsuarioEntity): Usuario {
        val progreso = moshi.adapter(Progreso::class.java).fromJson(entity.progreso) ?: Progreso(0,0,0)
        val preferencias = moshi.adapter(Preferencias::class.java).fromJson(entity.preferencias) ?: Preferencias("normal", emptyList(), true)
        val estadisticas = moshi.adapter(Estadisticas::class.java).fromJson(entity.estadisticas) ?: Estadisticas(0,0, emptyList(),0)
        val notificaciones = moshi.adapter<List<Notificacion>>(com.squareup.moshi.Types.newParameterizedType(List::class.java, Notificacion::class.java)).fromJson(entity.notificaciones) ?: emptyList()
        return Usuario(
            id = entity.id,
            nombre = entity.nombre,
            email = entity.email,
            idiomaMeta = entity.idiomaMeta,
            nivel = Nivel.valueOf(entity.nivel),
            progreso = progreso,
            preferencias = preferencias,
            estadisticas = estadisticas,
            notificaciones = notificaciones
        )
    }

    /**
     * Convierte un modelo de dominio [Usuario] a entidad Room.
     */
    private fun usuarioToEntity(usuario: Usuario): UsuarioEntity {
        return UsuarioEntity(
            id = usuario.id,
            nombre = usuario.nombre,
            email = usuario.email,
            idiomaMeta = usuario.idiomaMeta,
            nivel = usuario.nivel.name,
            progreso = moshi.adapter(Progreso::class.java).toJson(usuario.progreso),
            preferencias = moshi.adapter(Preferencias::class.java).toJson(usuario.preferencias),
            estadisticas = moshi.adapter(Estadisticas::class.java).toJson(usuario.estadisticas),
            notificaciones = moshi.adapter<List<Notificacion>>(com.squareup.moshi.Types.newParameterizedType(List::class.java, Notificacion::class.java)).toJson(usuario.notificaciones)
        )
    }
}
