package com.idiomasinternacionales.domain.usecase

import com.idiomasinternacionales.model.Notificacion
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetNotificacionesUseCase @Inject constructor() {
    operator fun invoke(): Flow<List<Notificacion>> {
        // Placeholder
        return flowOf(emptyList())
    }
}
