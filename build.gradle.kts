// build.gradle.kts (nivel de proyecto)
// Define los plugins y sus versiones para todos los módulos del proyecto.
// `apply false` significa que los plugins están disponibles, pero cada módulo debe aplicarlos explícitamente.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "2.2.20" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
    id("org.jetbrains.kotlin.kapt") version "1.9.22" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}