package com.idiomasinternacionales.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.idiomasinternacionales.data.local.entities.UsuarioEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {

    @Query("SELECT * FROM usuarios WHERE id = :id LIMIT 1")
    fun getUsuarioById(id: String): Flow<UsuarioEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsuario(usuario: UsuarioEntity)

    @Update
    suspend fun updateUsuario(usuario: UsuarioEntity)

    @Query("DELETE FROM usuarios")
    suspend fun deleteAllUsuarios()
}