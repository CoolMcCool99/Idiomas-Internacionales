package com.idiomasinternacionales.data.local

import androidx.room.TypeConverter
import com.idiomasinternacionales.model.Estadisticas
import com.idiomasinternacionales.model.Notificacion
import com.idiomasinternacionales.model.Preferencias
import com.idiomasinternacionales.model.Progreso
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

/**
 * Conversores de tipos para Room.
 * Le dice a Room cómo convertir objetos complejos a y desde un formato que pueda almacenar en la base de datos.
 * En este caso, usamos Moshi para serializar/deserializar los objetos a/desde JSON (String).
 */
class Converters {
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // Converters para Progreso
    @TypeConverter
    fun fromProgreso(progreso: Progreso?): String? {
        return moshi.adapter(Progreso::class.java).toJson(progreso)
    }

    @TypeConverter
    fun toProgreso(json: String?): Progreso? {
        return json?.let { moshi.adapter(Progreso::class.java).fromJson(it) }
    }

    // Converters para Preferencias
    @TypeConverter
    fun fromPreferencias(preferencias: Preferencias?): String? {
        return moshi.adapter(Preferencias::class.java).toJson(preferencias)
    }

    @TypeConverter
    fun toPreferencias(json: String?): Preferencias? {
        return json?.let { moshi.adapter(Preferencias::class.java).fromJson(it) }
    }

    // Converters para Estadisticas
    @TypeConverter
    fun fromEstadisticas(estadisticas: Estadisticas?): String? {
        return moshi.adapter(Estadisticas::class.java).toJson(estadisticas)
    }

    @TypeConverter
    fun toEstadisticas(json: String?): Estadisticas? {
        return json?.let { moshi.adapter(Estadisticas::class.java).fromJson(it) }
    }

    // Converters para List<Notificacion>
    @TypeConverter
    fun fromNotificacionList(notificaciones: List<Notificacion>?): String? {
        val type = Types.newParameterizedType(List::class.java, Notificacion::class.java)
        val adapter = moshi.adapter<List<Notificacion>>(type)
        return adapter.toJson(notificaciones)
    }

    @TypeConverter
    fun toNotificacionList(json: String?): List<Notificacion>? {
        val type = Types.newParameterizedType(List::class.java, Notificacion::class.java)
        val adapter = moshi.adapter<List<Notificacion>>(type)
        return json?.let { adapter.fromJson(it) }
    }
}
