package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.data.repository.PerfilRepository
import com.idiomasinternacionales.domain.model.PerfilUsuario

class GetPerfilUsuarioUseCase(private val repository: PerfilRepository) {
    suspend operator fun invoke(id: String): PerfilUsuario? = repository.getPerfilUsuario(id)
}

class SavePerfilUsuarioUseCase(private val repository: PerfilRepository) {
    suspend operator fun invoke(perfil: PerfilUsuario) = repository.savePerfilUsuario(perfil)
}
