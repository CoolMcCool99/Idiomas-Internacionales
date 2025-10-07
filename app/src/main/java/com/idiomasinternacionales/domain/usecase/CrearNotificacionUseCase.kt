package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.Notificacion
import javax.inject.Inject

class CrearNotificacionUseCase @Inject constructor() {
    suspend operator fun invoke(notificacion: Notificacion) {
        // Placeholder
    }
}
