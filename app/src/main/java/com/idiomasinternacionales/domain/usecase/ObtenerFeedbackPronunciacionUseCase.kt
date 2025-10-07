package com.idiomasinternacionales.domain.usecase

import javax.inject.Inject

class ObtenerFeedbackPronunciacionUseCase @Inject constructor() {
    suspend operator fun invoke(audioUrl: String): String {
        // Placeholder implementation
        return "Feedback para $audioUrl"
    }
}
