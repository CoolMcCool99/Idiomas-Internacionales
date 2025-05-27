package com.idiomasinternacionales.data.source.remote

import com.google.cloud.speech.v1.RecognitionAudio
import com.google.cloud.speech.v1.RecognitionConfig
import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding
import com.google.cloud.speech.v1.SpeechClient
import com.google.cloud.speech.v1.SpeechRecognitionAlternative
import com.google.cloud.speech.v1.SpeechRecognitionResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpeechRecognitionService @Inject constructor() {
    
    private val speechClient: SpeechClient = SpeechClient.create()
    
    suspend fun recognizeSpeech(audioBytes: ByteArray, languageCode: String = "es-ES"): String {
        return withContext(Dispatchers.IO) {
            try {
                val config = RecognitionConfig.newBuilder()
                    .setEncoding(AudioEncoding.LINEAR16)
                    .setSampleRateHertz(16000)
                    .setLanguageCode(languageCode)
                    .build()

                val audio = RecognitionAudio.newBuilder()
                    .setContent(audioBytes)
                    .build()

                val response = speechClient.recognize(config, audio)
                val results: List<SpeechRecognitionResult> = response.getResultsList()
                
                if (results.isEmpty()) {
                    return@withContext ""
                }
                
                val firstResult = results[0]
                val firstAlternative = firstResult.getAlternativesList()[0]
                firstAlternative.getTranscript()
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            }
        }
    }

    fun close() {
        speechClient.close()
    }
}
