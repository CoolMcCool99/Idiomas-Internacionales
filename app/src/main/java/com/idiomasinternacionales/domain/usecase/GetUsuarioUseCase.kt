package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.Usuario
import com.idiomasinternacionales.domain.repository.UsuarioRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsuarioUseCase @Inject constructor(private val usuarioRepository: UsuarioRepository) {
    operator fun invoke(id: String): Flow<Usuario?> {
        return usuarioRepository.getUsuarioById(id)
    }
}
