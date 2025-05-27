package com.idiomasinternacionales.data.repository

import com.idiomasinternacionales.data.model.User
import com.idiomasinternacionales.data.source.local.UserDao
import com.idiomasinternacionales.data.source.remote.UserService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDao: UserDao,
    private val userService: UserService
) {
    
    suspend fun getCurrentUser(): User {
        val cachedUser = userDao.getCurrentUser()
        return if (cachedUser == null) {
            val user = userService.fetchCurrentUser()
            userDao.insertUser(user)
            user
        } else {
            cachedUser
        }
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
        userService.updateUser(user)
    }

    suspend fun getUserProgress(): User.Progreso {
        return userDao.getUserProgress()
    }

    suspend fun updateUserProgress(progress: User.Progreso) {
        userDao.updateUserProgress(progress)
    }
}
