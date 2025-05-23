# Idiomas Internacionales

Guía definitiva para el desarrollo de la aplicación "Idiomas Internacionales", enfocada en el aprendizaje de idiomas con Inteligencia Artificial, rendimiento extremo y máxima seguridad.

---

## Tabla de Contenidos

- [Visión General](#visión-general)
- [Principios Clave del Desarrollo](#principios-clave-del-desarrollo)
- [Herramientas y Tecnologías](#herramientas-y-tecnologías)
- [Funcionalidades Clave](#funcionalidades-clave)
- [Proceso de Desarrollo](#proceso-de-desarrollo)
- [Entregables Esperados](#entregables-esperados)
- [Restricciones](#restricciones)
- [Privacidad y Cumplimiento Legal](#privacidad-y-cumplimiento-legal)
- [Mantenimiento y Actualizaciones](#mantenimiento-y-actualizaciones)
- [Licencia](#licencia)
- [Colaboración](#colaboración)
- [Documentación Técnica](#documentación-técnica)
- [Dependencias y Herramientas](#dependencias-y-herramientas)

---

## Visión General

Desarrollar una app móvil nativa para Android, priorizando la experiencia de aprendizaje interactivo y personalizado mediante IA. El éxito en Android es requisito previo para el desarrollo en iOS.

---

## Principios Clave del Desarrollo

- **Rendimiento Extremo:** Código Kotlin eficiente, mínimo consumo de batería.
- **Estabilidad:** Experiencia confiable, mínima ocurrencia de errores.
- **Seguridad:** Protección del código y datos del usuario.
- **Escalabilidad:** Arquitectura preparada para crecimiento y nuevos idiomas.
- **UI/UX Accesible:** Diseño moderno, intuitivo y modo oscuro puro (#000000).
- **Personalización Avanzada:** IA para adaptar la experiencia más allá de la evaluación.

---

## Herramientas y Tecnologías

- **Lenguaje:** Kotlin
- **IDE:** Android Studio (última versión estable)
- **Arquitectura:** MVVM y Android Architecture Components (ViewModel, LiveData, Room, Navigation, WorkManager)
- **UI:** Jetpack Compose + Material Design 3 (tema oscuro puro)
- **Dependencias:** Gradle con Kotlin DSL
- **Async:** Kotlin Coroutines
- **Persistencia:** Room, DataStore para datos simples
- **Networking:** Retrofit + OkHttp (JSON: Moshi por defecto, Gson solo si es requerido)
- **IA:**
  - Reconocimiento de voz: Google Cloud Speech-to-Text (preferido) o Azure Cognitive Services Speech (justificar elección si se cambia)
  - NLP y generación de contenido: Google Cloud Natural Language API y OpenAI API (GPT-3.5/4)
- **Seguridad:**
  - Ofuscación: ProGuard o R8
  - Detección de root/jailbreak
  - HTTPS en todas las comunicaciones (Certificate Pinning recomendado)
  - Almacenamiento seguro: Android Keystore
- **Monitoreo y Análisis:** Crashlytics, Google Analytics for Firebase
- **Pruebas:**
  - Unitarias: JUnit, Mockito (mínimo 80% cobertura)
  - Integración: Robolectric
  - UI: Espresso, Jetpack Compose testing

---

## Funcionalidades Clave

- Rutas de aprendizaje personalizadas (IA)
- Módulos: vocabulario, gramática, comprensión auditiva y oral
- Lecciones interactivas (flashcards, opción múltiple, rellenar huecos, ejercicios de escucha)
- Pronunciación avanzada (feedback fonético, comparación con nativos)
- Conversaciones simuladas con IA y feedback en tiempo real
- Gamificación (puntos, rachas, insignias, tablas de clasificación)
- Revisión espaciada (spaced repetition)
- Modo offline extendido (descarga de lecciones y ejercicios, IA ligera local)
- Mini-módulos de inmersión cultural
- Modo oscuro puro y accesibilidad (tamaño de texto, fuentes para dislexia, contraste)
- Perfiles de usuario (progreso, estadísticas, metas, configuración de idioma)
- Notificaciones inteligentes (recordatorios personalizables)

---

## Proceso de Desarrollo

1. **UI/UX:** Wireframes y mockups optimizados para modo oscuro y accesibilidad.
2. **Arquitectura:** Implementación MVVM y componentes base.
3. **Funcionalidades Core:** Desarrollo de aprendizaje e integración IA.
4. **Pruebas:** Unitarias (mínimo 80% cobertura), integración y UI en cada etapa.
5. **Iteraciones:** Mejoras según pruebas y feedback de usuarios beta.
6. **Seguridad:** Implementación rigurosa de medidas de seguridad.
7. **Optimización:** Mejoras finales de rendimiento y batería.
8. **Lanzamiento:** Publicación en Google Play Store.
9. **Beta:** Google Play Beta para feedback antes del lanzamiento final.

---

## Entregables Esperados

- Código fuente completo, estructurado y documentado.
- App Android funcional publicada en Google Play Store.
- Documentación técnica (arquitectura, APIs, pruebas).
- Reportes de cobertura de pruebas y resultados.

---

## Restricciones

- **Herramientas:** Solo usar las tecnologías listadas (consultar antes de introducir otras).
- **Plataforma:** Solo Android en la fase inicial.

---

## Privacidad y Cumplimiento Legal

- Cumplimiento con GDPR y normativas de privacidad.
- Manejo responsable de datos personales y biométricos (voz).
- Consentimiento explícito del usuario para datos sensibles.

---

## Mantenimiento y Actualizaciones

- Actualizaciones periódicas para solucionar bugs, mejorar rendimiento y añadir funciones.
- Gestión de issues y solicitudes mediante GitHub Issues.
- Registro de cambios en cada release (CHANGELOG.md).

---

## Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).  
Consulta el archivo LICENSE para los detalles.

---

## Colaboración

¡Contribuciones bienvenidas!

- Abre un Issue para errores o sugerencias.
- Haz un Pull Request siguiendo las convenciones y la guía de contribución.
- Consulta el archivo [CONTRIBUTING.md](CONTRIBUTING.md) para más detalles.

---

## Documentación Técnica

### Estructura de Carpetas y Archivos

- `/src/modules/`: Módulos principales de aprendizaje (vocabulario, gramática, comprensión auditiva y oral).
- `/src/ai/`: Lógica de personalización de rutas de aprendizaje con IA.
- `/src/lecciones/`: Tipos de lecciones interactivas (flashcards, opción múltiple, rellenar huecos, ejercicios de escucha).

### Estructura de Datos (Modelo Base)

#### Usuario
```kotlin
// Representación conceptual en Kotlin
 data class Usuario(
    val id: String,
    val nombre: String,
    val email: String,
    val idiomaMeta: String,
    val nivel: Nivel,
    val progreso: Progreso,
    val preferencias: Preferencias,
    val estadisticas: Estadisticas,
    val notificaciones: List<Notificacion>
)
```

#### Nivel
```kotlin
enum class Nivel { A1, A2, B1, B2, C1, C2 }
```

#### Estadísticas
```kotlin
 data class Estadisticas(
    val diasRacha: Int,
    val puntos: Int,
    val insignias: List<Insignia>,
    val tiempoTotalEstudio: Long // en minutos
)

 data class Insignia(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val fechaObtenida: Long
)
```

#### Notificación
```kotlin
 data class Notificacion(
    val id: String,
    val mensaje: String,
    val leida: Boolean,
    val fecha: Long
)
```

#### Configuración de Accesibilidad
```kotlin
 data class ConfiguracionAccesibilidad(
    val modoOscuro: Boolean,
    val fuenteDislexia: Boolean,
    val tamanoTexto: Float
)
```

#### Ruta de Aprendizaje
```kotlin
 data class RutaAprendizaje(
    val id: String,
    val nombre: String,
    val modulos: List<Modulo>,
    val adaptadaPorIA: Boolean,
    val fechaCreacion: Long,
    val fechaUltimaActualizacion: Long,
    val feedbackUsuario: String?
)
```

#### Módulo
```kotlin
 data class Modulo(
    val id: String,
    val tipo: TipoModulo, // Vocabulario, Gramática, Comprensión Auditiva, Oral
    val lecciones: List<Leccion>,
    val progreso: ProgresoModulo,
    val descripcion: String
)

 data class ProgresoModulo(
    val porcentaje: Int,
    val leccionesCompletadas: Int,
    val totalLecciones: Int
)
```

#### Lección
```kotlin
 data class Leccion(
    val id: String,
    val tipo: TipoLeccion, // Flashcard, Opción Múltiple, Rellenar Huecos, Escucha
    val contenido: ContenidoLeccion,
    val retroalimentacion: String?,
    val completada: Boolean,
    val fechaCompletada: Long?
)

sealed class ContenidoLeccion {
    data class Flashcard(val pregunta: String, val respuesta: String): ContenidoLeccion()
    data class OpcionMultiple(val pregunta: String, val opciones: List<String>, val respuestaCorrecta: Int): ContenidoLeccion()
    data class RellenarHuecos(val frase: String, val huecos: List<String>, val respuestas: List<String>): ContenidoLeccion()
    data class Escucha(val urlAudio: String, val pregunta: String, val respuesta: String): ContenidoLeccion()
}
```

#### Preferencias
```kotlin
 data class Preferencias(
    val ritmo: String, // rápido, normal, lento
    val temasFavoritos: List<String>,
    val notificacionesActivas: Boolean
)
```

---

### Ampliación de la Documentación Técnica

#### Arquitectura General
- **MVVM:** Separación clara entre lógica de negocio (ViewModel), datos (Model/Repository) y UI (View/Compose).
- **Persistencia:** Room para datos complejos (progreso, rutas, módulos) y DataStore para configuraciones simples.
- **IA:** Integración con APIs externas para personalización, generación de contenido y feedback fonético.
- **Seguridad:** Uso de Android Keystore, HTTPS con certificate pinning, detección de root/jailbreak y ofuscación con R8/ProGuard.
- **Accesibilidad:** Soporte para modo oscuro puro, fuentes para dislexia y ajuste de tamaño de texto.

#### Flujo de Personalización con IA
1. El usuario inicia sesión y selecciona idioma meta y nivel.
2. El sistema genera una ruta de aprendizaje inicial basada en nivel, preferencias y objetivos.
3. La IA adapta el contenido y ritmo según el progreso, feedback y desempeño del usuario.
4. Se actualizan módulos y lecciones dinámicamente, priorizando debilidades detectadas.
5. El usuario recibe retroalimentación personalizada y recomendaciones de estudio.

#### Ejemplo de Integración de Módulos
- Cada módulo (vocabulario, gramática, etc.) implementa una interfaz común para facilitar la integración y el seguimiento del progreso.
- Las lecciones pueden ser reutilizadas en diferentes rutas o módulos según la personalización.

#### Seguridad y Privacidad
- Todos los datos sensibles se almacenan cifrados.
- Consentimiento explícito para uso de voz y datos biométricos.
- Cumplimiento estricto con GDPR y normativas locales.

#### Pruebas y Calidad
- Cobertura mínima del 80% en pruebas unitarias y de integración.
- Pruebas de UI automatizadas para flujos críticos.
- Reportes de cobertura y resultados incluidos en cada release.

---

## Dependencias y Herramientas

La aplicación requiere las siguientes dependencias principales para su funcionamiento, desarrollo y pruebas. Todas deben ser gestionadas en el archivo `build.gradle.kts` (Kotlin DSL) del proyecto Android:

#### Dependencias de Android y Kotlin
- **Kotlin Standard Library**
- **AndroidX Core, AppCompat, Activity, Fragment**
- **Jetpack Compose** (UI moderna)
- **Material Design 3**
- **Android Architecture Components**: ViewModel, LiveData, Room, Navigation, WorkManager
- **Kotlin Coroutines** (asincronía)
- **Room** (persistencia local)
- **DataStore** (configuración y preferencias)
- **Retrofit + OkHttp** (networking seguro)
- **Moshi** (JSON, por defecto) o **Gson** (solo si es requerido)
- **Google Cloud Speech-to-Text** o **Azure Cognitive Services Speech** (reconocimiento de voz)
- **Google Cloud Natural Language API** y **OpenAI API** (NLP y generación de contenido)
- **Crashlytics** y **Google Analytics for Firebase** (monitoreo y análisis)
- **ProGuard o R8** (ofuscación y optimización)
- **JUnit, Mockito** (pruebas unitarias)
- **Robolectric** (pruebas de integración)
- **Espresso, Jetpack Compose Testing** (pruebas de UI)

#### Seguridad
- **Android Keystore** (almacenamiento seguro de claves)
- **Certificate Pinning** (en OkHttp)
- **Detección de root/jailbreak** (librerías recomendadas: SafetyNet, RootBeer)

#### Documentación de Instalación
- Todas las dependencias deben declararse en el archivo `build.gradle.kts` del módulo principal.
- Las claves y credenciales de APIs externas deben gestionarse de forma segura (no incluir en el repositorio).
- Se recomienda usar versiones estables y mantener actualizaciones automáticas con Dependabot (ver `.github/dependabot.yml`).

#### Ejemplo de sección de dependencias en `build.gradle.kts`:
```kotlin
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.moshi:moshi:1.15.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.google.firebase:firebase-crashlytics:18.6.2")
    implementation("com.google.firebase:firebase-analytics:21.5.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.0")
    // ...otras dependencias según necesidades
}
```

#### Notas
- Para módulos de IA, se debe seguir la documentación oficial de Google Cloud y OpenAI para la integración y autenticación.
- Las dependencias de seguridad y detección de root deben ser revisadas y actualizadas periódicamente.
- Documentar cualquier dependencia adicional en el README y en el CHANGELOG ante cada actualización.

---

Esta documentación y estructura de datos sirven como guía para el desarrollo, asegurando escalabilidad, seguridad y personalización avanzada en la app.
