package com.idiomasinternacionales.data.ia

import com.idiomasinternacionales.model.Usuario
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class IAUseCaseTest {
    private lateinit var iaService: IAService
    private lateinit var iaUseCase: IAUseCase

    @Before
    fun setUp() {
        iaService = object : IAService {
            override suspend fun obtenerFeedbackPronunciacion(audioUrl: String) = "OK"
            override suspend fun generarRutaPersonalizada(usuario: Usuario) = "Ruta generada"
        }
        iaUseCase = IAUseCase(iaService)
    }

    @Test
    fun testObtenerFeedbackPronunciacion() = runBlocking {
        val result = iaUseCase.obtenerFeedbackPronunciacion("audioUrl")
        assertEquals("OK", result)
    }

    @Test
    fun testGenerarRutaPersonalizada() = runBlocking {
        val usuario = Usuario("1", "Test", "mail", "en", Nivel.A1, Progreso(0,0,0), Preferencias("normal", emptyList(), true), Estadisticas(0,0, emptyList(),0), emptyList())
        val result = iaUseCase.generarRutaPersonalizada(usuario)
        assertEquals("Ruta generada", result)
    }
}
