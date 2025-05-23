Proyecto "Idiomas Internacionales": Guía de Desarrollo
Este documento sirve como la guía definitiva para el desarrollo de la aplicación "Idiomas Internacionales", detallando los requisitos, tecnologías y procesos para cada plataforma. El proyecto se abordará en fases, priorizando el desarrollo para Android antes de pasar a iOS.

1. Fase 1: Desarrollo para Android 🤖

1.1. Visión General del Proyecto
Desarrollar una aplicación móvil nativa para Android para el aprendizaje de idiomas, fusionando lo mejor de "Master English" y "Elsa Speak". 
La aplicación se centrará en una experiencia de aprendizaje interactiva, personalizada y altamente efectiva, potenciada por Inteligencia Artificial. 
Es crucial un rendimiento extremo, estabilidad inquebrantable y seguridad robusta. La interfaz de usuario será intuitiva, en modo oscuro puro (#000000) para pantallas AMOLED, e incluirá opciones de accesibilidad mejoradas. 
El éxito en Android es un prerrequisito para iniciar el desarrollo en iOS.

1.2. Principios Clave del Desarrollo
Optimización y Rendimiento Extremos: Código Kotlin altamente eficiente, tiempos de carga mínimos y bajo consumo de batería.
Estabilidad Inquebrantable: Minimizar crashes y errores para una experiencia de usuario fluida y confiable.
Seguridad Primero: Implementar medidas robustas para proteger el código fuente de modificaciones no autorizadas y salvaguardar la privacidad de los datos del usuario.
Escalabilidad Futura: Diseñar una arquitectura que permita añadir nuevas funcionalidades e idiomas sin necesidad de reingeniería extensiva.
UI/UX Excepcional y Accesible: Un diseño moderno, intuitivo y atractivo, inspirado en "Master English" y "Elsa Speak", con una implementación estricta del modo oscuro puro (#000000) y funcionalidades de accesibilidad mejoradas.
Personalización Avanzada: La IA se usará para adaptar y personalizar profundamente la experiencia de aprendizaje del usuario, yendo más allá de la simple evaluación.

1.3. Herramientas y Tecnologías (Obligatorias)
Lenguaje de Programación: Kotlin.
Entorno de Desarrollo Integrado (IDE): Android Studio (última versión estable).
Arquitectura: MVVM (Model-View-ViewModel), utilizando Android Architecture Components (ViewModel, LiveData, Room, Navigation Component, WorkManager) para una aplicación robusta y mantenible.
Interfaz de Usuario (UI): Jetpack Compose para la creación de la UI declarativa. Se utilizará Material Design 3, adaptado al tema oscuro puro.
Gestión de Dependencias: Gradle con Kotlin DSL.
Manejo de Hilos y Tareas Asíncronas: Coroutines de Kotlin para una gestión eficiente.
Persistencia de Datos Locales: Room para la base de datos local. Para datos más simples, se considerará DataStore.
Networking: Retrofit para las llamadas a la API de IA y otros servicios, con OkHttp como cliente HTTP. La serialización/deserialización de JSON se hará con Gson o Moshi.
* Integración de IA:
Reconocimiento de Voz y Evaluación de Pronunciación: SDK de Google Cloud Speech-to-Text o Azure Cognitive Services Speech. Se requiere precisión y funcionalidades avanzadas de evaluación fonética (similares a Elsa Speak) con feedback específico.
Procesamiento de Lenguaje Natural (NLP) y Generación de Contenido: Se considerará Google Cloud Natural Language API y OpenAI API (GPT-3.5/4) para la creación de ejercicios, diálogos, corrección gramatical y explicaciones contextuales.
* Seguridad:
Ofuscación de Código: Uso exhaustivo de ProGuard o R8 para dificultar la ingeniería inversa.
Detección de Root/Jailbreak: Implementación de mecanismos de detección.
Comunicación Segura: Todas las comunicaciones de red mediante HTTPS. Se considerará "Certificate Pinning".
Almacenamiento Seguro de Claves: Uso del Android Keystore System para datos sensibles y claves de API.
Análisis y Reporte de Errores: Firebase Crashlytics.
Analíticas de Uso: Google Analytics for Firebase.
* Pruebas:
Unitarias: JUnit y Mockito.
Integración: Robolectric.
UI: Espresso o herramientas de Jetpack Compose para testing.

1.4. Funcionalidades Clave (Fusión Master English & Elsa Speak)
Rutas de Aprendizaje Personalizadas y Adaptativas (Impulsadas por IA): La IA diseñará y ajustará dinámicamente el plan de estudios según los objetivos, progreso y áreas de debilidad del usuario.
Módulos de Aprendizaje por Niveles: Desde básico hasta avanzado, cubriendo vocabulario, gramática, comprensión auditiva y expresión oral.
Lecciones Interactivas: Ejercicios de vocabulario (flashcards, opción múltiple, rellenar huecos), explicaciones gramaticales claras con ejemplos y ejercicios de escucha con audios de hablantes nativos.
Práctica de Pronunciación Avanzada (Estilo Elsa Speak): Reconocimiento de voz para evaluar palabras y frases, feedback fonético detallado (errores en sonidos, entonación, fluidez), comparación con hablantes nativos y ejercicios específicos para fonemas problemáticos.
Conversaciones Simuladas con IA: Diálogos interactivos donde la IA asume un rol, con corrección y sugerencias en tiempo real, y escenarios de la vida real.
Gamificación: Puntos, rachas, insignias y tablas de clasificación para motivar al usuario.
Revisión Espaciada: Sistema inteligente para programar repasos de vocabulario y conceptos aprendidos.
Modo Offline Extendido: Descarga de lecciones completas, incluyendo ejercicios interactivos con posible funcionalidad IA ligera en dispositivo para feedback básico.
Mini-Módulos de Inmersión Cultural: Píldoras interactivas sobre costumbres, etiqueta y curiosidades culturales del idioma.
Modo Oscuro Puro: Interfaz con fondo negro (#000000) y textos/elementos en colores contrastantes para pantallas AMOLED y reducir la fatiga visual.
Opciones de Accesibilidad Mejoradas: Ajuste de tamaño de texto, fuentes para dislexia, opciones de contraste adicionales.
Perfiles de Usuario: Registro de progreso, estadísticas, establecimiento de metas, y configuración de idioma nativo y de aprendizaje.
Notificaciones Inteligentes: Recordatorios de práctica y avisos de nuevo contenido (personalizables).

1.5. Proceso de Desarrollo
Diseño UI/UX: Creación detallada de wireframes y mockups optimizados para el modo oscuro puro y la accesibilidad, basándose en la fusión de "Master English" y "Elsa Speak".
Desarrollo de Arquitectura Base: Implementación de la arquitectura MVVM con los Android Architecture Components.
Implementación de Funcionalidades Core: Desarrollo del sistema de aprendizaje y la integración de la IA para pronunciación y personalización.
Pruebas Exhaustivas: Realización de pruebas unitarias, de integración y de UI en cada etapa del desarrollo.
Iteraciones y Feedback: Ajustes y mejoras basados en el feedback y los resultados de las pruebas.
Medidas de Seguridad: Implementación de todas las medidas de seguridad especificadas.
Optimización Final: Optimización de rendimiento y consumo de batería.
Lanzamiento a Producción: Publicación de la aplicación en Google Play Store.

1.6. Entregables Esperados
Código fuente completo y bien documentado.
Aplicación Android funcional y publicada en Google Play Store.
Documentación técnica de la arquitectura y las APIs.

1.7. Restricciones
Adherencia Estricta a las Herramientas Especificadas: No se introducirán otras herramientas o tecnologías sin aprobación previa.
Enfoque Único en Android Inicialmente: No se asignarán recursos al desarrollo de iOS hasta que la versión de Android esté completamente funcional y en producción.
