package com.idiomasinternacionales.data.remote

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("usuario/{id}")
    suspend fun getUsuarioRemoto(@Path("id") id: String): String // Simulación, reemplazar por modelo real
}
