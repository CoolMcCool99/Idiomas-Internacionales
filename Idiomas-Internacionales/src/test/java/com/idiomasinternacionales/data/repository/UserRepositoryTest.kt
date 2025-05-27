package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.model.User
import com.idiomasinternacionales.data.model.User.Nivel
import com.idiomasinternacionales.data.source.local.UserDao
import com.idiomasinternacionales.data.source.remote.UserService
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class UserRepositoryTest {
    
    private lateinit var userRepository: UserRepository
    private lateinit var userDao: UserDao
    private lateinit var userService: UserService
    
    @Before
    fun setUp() {
        userDao = mockk()
        userService = mockk()
        userRepository = UserRepository(userDao, userService)
    }
    
    @Test
    fun `getCurrentUser should return cached user when available`() = runBlocking {
        // Given
        val testUser = User(
            id = "1",
            nombre = "Test",
            email = "test@example.com",
            idiomaMeta = "en",
            nivel = Nivel.A1,
            progreso = User.Progreso(),
            preferencias = User.Preferencias(),
            estadisticas = User.Estadisticas(),
            notificaciones = emptyList()
        )
        
        coEvery { userDao.getCurrentUser() } returns testUser
        
        // When
        val result = userRepository.getCurrentUser()
        
        // Then
        assertEquals(testUser, result)
        coVerify(exactly = 0) { userService.fetchCurrentUser() }
    }
    
    @Test
    fun `getCurrentUser should fetch from remote when no cached user`() = runBlocking {
        // Given
        val testUser = User(
            id = "1",
            nombre = "Test",
            email = "test@example.com",
            idiomaMeta = "en",
            nivel = Nivel.A1,
            progreso = User.Progreso(),
            preferencias = User.Preferencias(),
            estadisticas = User.Estadisticas(),
            notificaciones = emptyList()
        )
        
        coEvery { userDao.getCurrentUser() } returns null
        coEvery { userService.fetchCurrentUser() } returns testUser
        
        // When
        val result = userRepository.getCurrentUser()
        
        // Then
        assertEquals(testUser, result)
        coVerify(exactly = 1) { userDao.insertUser(testUser) }
    }
    
    @Test
    fun `updateUser should update both local and remote`() = runBlocking {
        // Given
        val testUser = User(
            id = "1",
            nombre = "Test",
            email = "test@example.com",
            idiomaMeta = "en",
            nivel = Nivel.A1,
            progreso = User.Progreso(),
            preferencias = User.Preferencias(),
            estadisticas = User.Estadisticas(),
            notificaciones = emptyList()
        )
        
        // When
        userRepository.updateUser(testUser)
        
        // Then
        coVerify(exactly = 1) { userDao.updateUser(testUser) }
        coVerify(exactly = 1) { userService.updateUser(testUser) }
    }
}
