package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.repository.UsuarioRepository
import javax.inject.Inject

class CreateUsuarioUseCase @Inject constructor(private val usuarioRepository: UsuarioRepository) {
    suspend operator fun invoke(usuario: Usuario) {
        usuarioRepository.insertUsuario(usuario)
    }
}
