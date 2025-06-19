# Idiomas Internacionales App

Plantilla base de aplicación Android en Kotlin.

- Arquitectura MVVM
- Jetpack Compose
- Room, DataStore
- Retrofit, OkHttp, Moshi
- Integración con Google Cloud Speech-to-Text, Natural Language API, OpenAI API
- Crashlytics, Firebase Analytics
- ProGuard/R8
- Pruebas: JUnit, Mockito, Robolectric, Espresso, Compose Testing
- Modularidad para vocabulario, gramática, comprensión auditiva/oral, IA y lecciones interactivas
- Seguridad y accesibilidad según el README principal

## Estructura
- `src/main/java/com/idiomasinternacionales/` (código fuente principal)
- `src/main/res/` (recursos)
- `src/main/assets/` (archivos de datos)
- `modules/` (subcarpetas para cada módulo)
- `ai/` (lógica de IA)
- `lecciones/` (tipos de lecciones)

## Configuración
- Edita `build.gradle.kts` para dependencias y plugins.
- Reemplaza `google-services.json` por el archivo real de Firebase.
- Personaliza `proguard-rules.pro` según necesidades de seguridad.

## Primeros pasos
1. Abre la carpeta `app` en Android Studio.
2. Sincroniza el proyecto y descarga dependencias.
3. Configura los módulos y comienza el desarrollo.

Consulta el README principal del repositorio para lineamientos y prioridades.

# Estado actual del proyecto

El proyecto cuenta con la estructura modular base, configuración de dependencias y pantallas principales implementadas en Jetpack Compose bajo arquitectura MVVM. Sin embargo, no ha sido posible compilar ni validar la app en este entorno debido a restricciones de red que impiden la descarga de la distribución de Gradle y la generación del wrapper (`./gradlew`).

## Pendientes y recomendaciones

- **Compilación y sincronización:** Es indispensable abrir el proyecto en Android Studio en un entorno con acceso a internet para sincronizar dependencias, generar el wrapper de Gradle y compilar la app.
- **Validación funcional:** Tras la primera compilación exitosa, validar la estructura, navegación y pantallas base.
- **Implementación funcional:** Continuar con la lógica de los módulos (vocabulario, gramática, comprensión auditiva/oral), rutas IA, integración de APIs, seguridad y accesibilidad.
- **Documentar ajustes:** Registrar en este archivo cualquier ajuste, error o solución tras la compilación y pruebas iniciales.

## Motivo del bloqueo

- El entorno actual no permite la descarga de Gradle ni la ejecución de `./gradlew`, lo que impide compilar y validar la app.

---

**Siguiente paso:** Abrir y sincronizar el proyecto en Android Studio para continuar el desarrollo.
