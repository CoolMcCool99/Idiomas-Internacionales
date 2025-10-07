package com.idiomasinternacionales.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.idiomasinternacionales.data.local.dao.RutaAprendizajeDao
import com.idiomasinternacionales.data.local.dao.UsuarioDao
import com.idiomasinternacionales.data.local.entities.RutaAprendizajeEntity
import com.idiomasinternacionales.data.local.entities.UsuarioEntity

import androidx.room.TypeConverters

@Database(entities = [UsuarioEntity::class, RutaAprendizajeEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
    abstract fun rutaAprendizajeDao(): RutaAprendizajeDao
}
