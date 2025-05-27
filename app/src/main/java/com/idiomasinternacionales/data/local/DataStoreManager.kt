package com.idiomasinternacionales.data.local

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "config")

object DataStoreManager {
    val MODO_OSCURO = booleanPreferencesKey("modo_oscuro")
    val FUENTE_DISLEXIA = booleanPreferencesKey("fuente_dislexia")
    val TAMANO_TEXTO = floatPreferencesKey("tamano_texto")
    val IDIOMA_META = stringPreferencesKey("idioma_meta")

    suspend fun setModoOscuro(context: Context, value: Boolean) {
        context.dataStore.edit { it[MODO_OSCURO] = value }
    }
    fun getModoOscuro(context: Context): Flow<Boolean> =
        context.dataStore.data.map { it[MODO_OSCURO] ?: false }

    suspend fun setFuenteDislexia(context: Context, value: Boolean) {
        context.dataStore.edit { it[FUENTE_DISLEXIA] = value }
    }
    fun getFuenteDislexia(context: Context): Flow<Boolean> =
        context.dataStore.data.map { it[FUENTE_DISLEXIA] ?: false }

    suspend fun setTamanoTexto(context: Context, value: Float) {
        context.dataStore.edit { it[TAMANO_TEXTO] = value }
    }
    fun getTamanoTexto(context: Context): Flow<Float> =
        context.dataStore.data.map { it[TAMANO_TEXTO] ?: 16f }

    suspend fun setIdiomaMeta(context: Context, value: String) {
        context.dataStore.edit { it[IDIOMA_META] = value }
    }
    fun getIdiomaMeta(context: Context): Flow<String> =
        context.dataStore.data.map { it[IDIOMA_META] ?: "" }
}
