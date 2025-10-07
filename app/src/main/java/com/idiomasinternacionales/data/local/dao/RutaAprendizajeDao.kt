package com.idiomasinternacionales.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.idiomasinternacionales.data.local.entities.RutaAprendizajeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RutaAprendizajeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRutaAprendizaje(ruta: RutaAprendizajeEntity)

    @Update
    suspend fun updateRutaAprendizaje(ruta: RutaAprendizajeEntity)

    @Query("SELECT * FROM rutas_aprendizaje WHERE id = :rutaId")
    fun getRutaAprendizajeById(rutaId: String): Flow<RutaAprendizajeEntity?>

    @Query("SELECT * FROM rutas_aprendizaje")
    fun getAllRutasAprendizaje(): Flow<List<RutaAprendizajeEntity>>
}
