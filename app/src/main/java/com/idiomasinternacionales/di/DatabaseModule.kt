package com.idiomasinternacionales.di

import android.content.Context
import androidx.room.Room
import com.idiomasinternacionales.data.local.AppDatabase
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao
import com.idiomasinternacionales.data.local.dao.UsuarioDao
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "idiomas_internacionales_database"
        )
            // La anotación @TypeConverters(Converters::class) en AppDatabase
            // es suficiente. No se necesita .addTypeConverter() aquí.
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideUsuarioDao(database: AppDatabase): UsuarioDao {
        return database.usuarioDao()
    }

    @Provides
    fun provideRutaAprendizajeDao(database: AppDatabase): RutaAprendizajeDao {
        return database.rutaAprendizajeDao()
    }
}