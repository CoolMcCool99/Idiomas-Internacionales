package com.idiomasinternacionales.domain.model

import com.idiomasinternacionales.domain.model.*

object DummyData {
    val usuarioDemo = Usuario(
        id = "1",
        nombre = "Demo User",
        email = "demo@idiomas.com",
        idiomaMeta = "Inglés",
        nivel = Nivel.A1,
        progreso = Progreso(10, 1, 10),
        preferencias = Preferencias("normal", listOf("vocabulario"), true),
        estadisticas = Estadisticas(1, 100, listOf(), 60),
        notificaciones = listOf()
    )
}
