package com.idiomasinternacionales.di

import android.content.Context
import androidx.room.Room
import com.idiomasinternacionales.data.local.AppDatabase
import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.repository.UsuarioRepository
import com.idiomasinternacionales.data.repository.UsuarioRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
    fun provideUsuarioRepository(dao: UsuarioDao): UsuarioRepository = UsuarioRepositoryImpl(dao)
}
