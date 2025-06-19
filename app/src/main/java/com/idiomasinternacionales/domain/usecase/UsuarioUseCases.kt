package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.domain.repository.UsuarioRepository
import com.idiomasinternacionales.domain.model.Usuario

class GetUsuarioUseCase(private val repository: UsuarioRepository) {
    suspend operator fun invoke(id: String): Usuario? = repository.getUsuario(id)
}

class SaveUsuarioUseCase(private val repository: UsuarioRepository) {
    suspend operator fun invoke(usuario: Usuario) = repository.saveUsuario(usuario)
}

class ClearUsuariosUseCase(private val repository: UsuarioRepository) {
    suspend operator fun invoke() = repository.clearUsuarios()
}
