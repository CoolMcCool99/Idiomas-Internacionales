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

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "idiomas_db").build()

    @Provides
    fun provideUsuarioDao(db: AppDatabase): UsuarioDao = db.usuarioDao()

    @Provides
    @Singleton
    fun provideApiService(): ApiService = Retrofit.Builder()
        .baseUrl("https://api.ejemplo.com/") // Cambiar por la real
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideUsuarioRepository(dao: UsuarioDao, api: ApiService): UsuarioRepository = UsuarioRepositoryImpl(dao, api)
}
