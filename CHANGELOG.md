# CHANGELOG

Todos los cambios importantes de este proyecto se documentarán en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/es/1.0.0/), y este proyecto sigue [Semantic Versioning](https://semver.org/lang/es/).

## [Unreleased]
### Añadido
- Estructura base de carpetas y archivos para módulos principales, IA y lecciones interactivas.
- Documentación técnica y estructura de datos detallada en el README.md.
- Modelos de datos en Kotlin para usuario, rutas de aprendizaje, módulos y lecciones.
- Descripción de arquitectura, flujos de IA, integración de módulos, seguridad y pruebas.
- Sección detallada de dependencias, herramientas y gestión en build.gradle.kts, con ejemplos y recomendaciones.
- Implementación inicial de modelos de dominio, entidad Room, DAO, repositorio, casos de uso y ViewModel para Usuario.
- Módulo de inyección de dependencias con Hilt.
- Pantalla principal de bienvenida y navegación básica con Jetpack Compose.
- Conexión de HomeScreen a la navegación principal.
- DummyData para pruebas rápidas de UI y lógica.
- HomeScreen ahora muestra el nombre del usuario demo usando StateFlow y ViewModel.
- Inyección de ViewModel en la navegación y carga automática de usuario demo.
- Modelos de dominio para módulos de aprendizaje y lecciones interactivas.
- Repositorio, casos de uso y ViewModel para módulos de aprendizaje.
- Pantalla Compose para mostrar la lista de módulos de aprendizaje.
- Ruta de navegación para la pantalla de módulos de aprendizaje.
- Modelos y repositorio para lecciones interactivas (flashcard, opción múltiple, rellenar huecos, escucha).
- Casos de uso y ViewModel para lecciones interactivas.
- Pantalla Compose para mostrar las lecciones interactivas de un módulo.
- Rutas de navegación para acceder a las lecciones desde los módulos.
- Modelos de dominio y repositorio para perfil de usuario y gamificación.
- Casos de uso y ViewModel para perfil de usuario.
- Pantalla Compose para mostrar el perfil de usuario y gamificación.
- Interfaz y clase base para integración de IA (rutas personalizadas y feedback de pronunciación).
- Módulo de Hilt para proveer repositorios de módulos, lecciones, perfil y servicio de IA.
- Utilidades de seguridad para detección de root y emulador.
- TypeConverters para persistencia avanzada de objetos complejos en Room.
- Modelos, repositorio, casos de uso y ViewModel para notificaciones inteligentes.
- Pantalla Compose para mostrar y gestionar notificaciones inteligentes.
- DataStoreManager para persistencia simple y modo offline de configuraciones clave del usuario.
- Modelos, repositorio, casos de uso y ViewModel para gamificación avanzada y ranking.
- Pantalla Compose para mostrar gamificación avanzada y ranking de usuarios.
- Integración de feedback de IA: casos de uso, ViewModel y pantalla Compose para feedback de pronunciación y rutas personalizadas.
