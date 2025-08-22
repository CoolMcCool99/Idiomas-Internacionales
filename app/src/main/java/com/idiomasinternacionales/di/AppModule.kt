package com.idiomasinternacionales.di

import android.content.Context
import androidx.room.Room
import com.idiomasinternacionales.data.local.AppDatabase
import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.remote.ApiService
import com.idiomasinternacionales.data.repository.UsuarioRepository
import com.idiomasinternacionales.data.repository.UsuarioRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

private const val API_BASE_URL = "https://api.ejemplo.com/" // TODO: Mover a BuildConfig

/**
 * Módulo de Hilt para proveer dependencias a nivel de aplicación (Singleton).
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /**
     * Provee la instancia única de la base de datos Room.
     */
    @Provides
    @Singleton
    fun provideDatabase(appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "idiomas_db").build()

    /**
     * Provee el DAO para la entidad de Usuario.
     */
    @Provides
    fun provideUsuarioDao(db: AppDatabase): UsuarioDao = db.usuarioDao()

    /**
     * Provee la instancia única del cliente de red Retrofit (ApiService).
     */
    @Provides
    @Singleton
    fun provideApiService(): ApiService = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    /**
     * Provee la implementación del repositorio de Usuario.
     */
    @Provides
    @Singleton
    fun provideUsuarioRepository(dao: UsuarioDao, api: ApiService): UsuarioRepository = UsuarioRepositoryImpl(dao, api)
}
