package com.idiomasinternacionales.di

import com.idiomasinternacionales.data.ia.IAService
import com.idiomasinternacionales.data.ia.IAServiceImpl
import com.idiomasinternacionales.data.repository.LeccionRepository
import com.idiomasinternacionales.data.repository.LeccionRepositoryImpl
import com.idiomasinternacionales.data.repository.ModuloRepository
import com.idiomasinternacionales.data.repository.ModuloRepositoryImpl
import com.idiomasinternacionales.data.repository.PerfilRepository
import com.idiomasinternacionales.data.repository.PerfilRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FeatureModule {
    @Provides
    @Singleton
    fun provideModuloRepository(): ModuloRepository = ModuloRepositoryImpl()

    @Provides
    @Singleton
    fun provideLeccionRepository(): LeccionRepository = LeccionRepositoryImpl()

    @Provides
    @Singleton
    fun providePerfilRepository(): PerfilRepository = PerfilRepositoryImpl()

    @Provides
    @Singleton
    fun provideIAService(): IAService = IAServiceImpl()
}
