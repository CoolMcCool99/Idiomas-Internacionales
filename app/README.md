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
