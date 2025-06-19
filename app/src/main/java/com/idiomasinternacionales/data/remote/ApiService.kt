package com.idiomasinternacionales.data.remote

import com.idiomasinternacionales.model.Usuario
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Servicio remoto para sincronización de usuarios con backend/API.
 */
interface ApiService {
    /**
     * Obtiene un usuario remoto por su id.
     */
    @GET("usuario/{id}")
    suspend fun getUsuarioRemoto(@Path("id") id: String): Usuario

    /**
     * Guarda o actualiza un usuario en el backend remoto.
     */
    @POST("usuario/")
    suspend fun saveUsuarioRemoto(@Body usuario: Usuario): Boolean
}
