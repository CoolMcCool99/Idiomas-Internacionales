package com.idiomasinternacionales.data.source.remote

import com.theokanning.openai.service.OpenAiService
import com.theokanning.openai.completion.chat.ChatCompletionRequest
import com.theokanning.openai.completion.chat.ChatMessage
import com.theokanning.openai.completion.chat.ChatCompletionResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OpenAIService @Inject constructor() {
    private val apiKey = "TU_API_KEY_AQUI"
    private val service = OpenAiService(apiKey)

    suspend fun generateResponse(
        messages: List<ChatMessage>,
        model: String = "gpt-3.5-turbo"
    ): String {
        return withContext(Dispatchers.IO) {
            try {
                val request = ChatCompletionRequest
                    .builder()
                    .messages(messages)
                    .model(model)
                    .build()

                val result = service.createChatCompletion(request)
                result.choices.firstOrNull()?.message?.content ?: ""
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            }
        }
    }

    suspend fun generateTranslation(
        text: String,
        targetLanguage: String,
        sourceLanguage: String = "es"
    ): String {
        val messages = listOf(
            ChatMessage(
                "system",
                "Eres un traductor experto. Traduce el siguiente texto del idioma $sourceLanguage al idioma $targetLanguage."
            ),
            ChatMessage("user", text)
        )

        return generateResponse(messages)
    }

    suspend fun generateLanguagePractice(
        topic: String,
        language: String
    ): String {
        val messages = listOf(
            ChatMessage(
                "system",
                "Genera una lección interactiva para aprender $language sobre el tema: $topic"
            )
        )

        return generateResponse(messages)
    }
}
