package com.idiomasinternacionales.data.local

import androidx.room.TypeConverter
import com.idiomasinternacionales.domain.model.Estadisticas
import com.idiomasinternacionales.domain.model.Notificacion
import com.idiomasinternacionales.domain.model.Preferencias
import com.idiomasinternacionales.domain.model.Progreso
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

/**
 * Conversores de tipos para Room. Permiten que la base de datos almacene tipos de datos complejos
 * convirtiéndolos a tipos primitivos (en este caso, String JSON) y viceversa.
 * Room utiliza estos conversores automáticamente al leer o escribir en la base de datos.
 */
class Converters {
    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    private val notificacionesListAdapter = moshi.adapter<List<Notificacion>>(Types.newParameterizedType(List::class.java, Notificacion::class.java))
    private val progresoAdapter = moshi.adapter(Progreso::class.java)
    private val preferenciasAdapter = moshi.adapter(Preferencias::class.java)
    private val estadisticasAdapter = moshi.adapter(Estadisticas::class.java)

    @TypeConverter
    fun fromProgreso(progreso: Progreso?): String? = progresoAdapter.toJson(progreso)

    @TypeConverter
    fun toProgreso(json: String?): Progreso? = json?.let { progresoAdapter.fromJson(it) }

    @TypeConverter
    fun fromPreferencias(preferencias: Preferencias?): String? = preferenciasAdapter.toJson(preferencias)

    @TypeConverter
    fun toPreferencias(json: String?): Preferencias? = json?.let { preferenciasAdapter.fromJson(it) }

    @TypeConverter
    fun fromEstadisticas(estadisticas: Estadisticas?): String? = estadisticasAdapter.toJson(estadisticas)

    @TypeConverter
    fun toEstadisticas(json: String?): Estadisticas? = json?.let { estadisticasAdapter.fromJson(it) }

    @TypeConverter
    fun fromNotificacionesList(list: List<Notificacion>?): String? = notificacionesListAdapter.toJson(list)

    @TypeConverter
    fun toNotificacionesList(json: String?): List<Notificacion>? = json?.let { notificacionesListAdapter.fromJson(it) }
}