pluginManagement {
    repositories {
        google()       // Репозиторий для плагинов Android
        mavenCentral() // Репозиторий для Kotlin и других зависимостей
    }
    plugins {
        id("com.android.application") version "8.7.2"
        kotlin("android") version "2.0.21"
        kotlin("kapt") version "2.0.21"
    }
}

dependencyResolutionManagement {
    repositories {
        google()       // Репозиторий для зависимостей Android
        mavenCentral() // Репозиторий для Kotlin и других зависимостей
    }
}

rootProject.name = "DnDCharacterManager"
include(":app")
