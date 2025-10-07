package com.idiomasinternacionales.di

import com.idiomasinternacionales.data.repository.RutaAprendizajeRepositoryImpl
import com.idiomasinternacionales.data.repository.UsuarioRepositoryImpl
import com.idiomasinternacionales.domain.repository.RutaAprendizajeRepository
import com.idiomasinternacionales.domain.repository.UsuarioRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindUsuarioRepository(usuarioRepositoryImpl: UsuarioRepositoryImpl): UsuarioRepository

    @Binds
    @Singleton
    abstract fun bindRutaAprendizajeRepository(rutaAprendizajeRepositoryImpl: RutaAprendizajeRepositoryImpl): RutaAprendizajeRepository
}
