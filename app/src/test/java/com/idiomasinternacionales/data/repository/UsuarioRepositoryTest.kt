package com.idiomasinternacionales.data.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.idiomasinternacionales.data.local.UsuarioDao
import com.idiomasinternacionales.data.local.UsuarioEntity
import com.idiomasinternacionales.data.remote.ApiService
import com.idiomasinternacionales.model.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(AndroidJUnit4::class)
class UsuarioRepositoryTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var usuarioDao: UsuarioDao
    private lateinit var apiService: ApiService
    private lateinit var repository: UsuarioRepositoryImpl

    @Before
    fun setUp() {
        usuarioDao = mock(UsuarioDao::class.java)
        apiService = mock(ApiService::class.java)
        repository = UsuarioRepositoryImpl(usuarioDao, apiService)
    }

    @Test
    fun testSaveAndGetUsuario() = runTest {
        val usuario = Usuario(
            id = "1",
            nombre = "Test",
            email = "test@mail.com",
            idiomaMeta = "en",
            nivel = Nivel.A1,
            progreso = Progreso(100, 5, 5),
            preferencias = Preferencias("normal", listOf("viajes"), true),
            estadisticas = Estadisticas(10, 100, emptyList(), 120),
            notificaciones = emptyList()
        )
        repository.saveUsuario(usuario)
        verify(usuarioDao).insertUsuario(any(UsuarioEntity::class.java))
    }

    @Test
    fun testClearUsuarios() = runTest {
        repository.clearUsuarios()
        verify(usuarioDao).deleteAllUsuarios()
    }
}
