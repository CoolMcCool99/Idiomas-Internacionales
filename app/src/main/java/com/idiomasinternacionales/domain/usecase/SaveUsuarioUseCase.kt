package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.Usuario
import javax.inject.Inject

class SaveUsuarioUseCase @Inject constructor() {
    suspend operator fun invoke(usuario: Usuario) {
        // Placeholder
    }
}
