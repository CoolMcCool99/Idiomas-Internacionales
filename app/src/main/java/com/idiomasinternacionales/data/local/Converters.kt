package com.idiomasinternacionales.data.local

import androidx.room.TypeConverter
import com.squareup.moshi.Moshi
import com.idiomasinternacionales.domain.model.*

object Converters {
    private val moshi = Moshi.Builder().build()

    @TypeConverter
    fun fromProgreso(progreso: Progreso): String = moshi.adapter(Progreso::class.java).toJson(progreso)
    @TypeConverter
    fun toProgreso(json: String): Progreso? = moshi.adapter(Progreso::class.java).fromJson(json)

    @TypeConverter
    fun fromPreferencias(preferencias: Preferencias): String = moshi.adapter(Preferencias::class.java).toJson(preferencias)
    @TypeConverter
    fun toPreferencias(json: String): Preferencias? = moshi.adapter(Preferencias::class.java).fromJson(json)

    @TypeConverter
    fun fromEstadisticas(estadisticas: Estadisticas): String = moshi.adapter(Estadisticas::class.java).toJson(estadisticas)
    @TypeConverter
    fun toEstadisticas(json: String): Estadisticas? = moshi.adapter(Estadisticas::class.java).fromJson(json)

    @TypeConverter
    fun fromNotificaciones(list: List<Notificacion>): String = moshi.adapter<List<Notificacion>>(Types.newParameterizedType(List::class.java, Notificacion::class.java)).toJson(list)
    @TypeConverter
    fun toNotificaciones(json: String): List<Notificacion>? = moshi.adapter<List<Notificacion>>(Types.newParameterizedType(List::class.java, Notificacion::class.java)).fromJson(json)
}
