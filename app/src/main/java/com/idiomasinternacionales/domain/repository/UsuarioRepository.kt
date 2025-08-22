package com.idiomasinternacionales.domain/repository

import com.idiomasinternacionales.domain.model.Usuario

/**
 * Define el contrato para las operaciones de datos relacionadas con el [Usuario].
 * Esta interfaz se encuentra en la capa de dominio y su implementación en la capa de datos,
 * siguiendo los principios de Arquitectura Limpia.
 */
interface UsuarioRepository {
    /**
     * Recupera un usuario específico por su identificador único.
     * @param id El ID del usuario a obtener.
     * @return El [Usuario] correspondiente o `null` si no se encuentra.
     */
    suspend fun getUsuario(id: String): Usuario?

    /**
     * Guarda (inserta o actualiza) un usuario en la fuente de datos.
     * @param usuario El objeto [Usuario] a guardar.
     */
    suspend fun saveUsuario(usuario: Usuario)

    /**
     * Elimina todos los datos de usuarios de la fuente de datos local.
     * Usado para operaciones de limpieza o cierre de sesión.
     */
    suspend fun clearUsuarios()
}
