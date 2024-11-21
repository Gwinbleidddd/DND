plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.dndcharactermanager"  // Указание namespace
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dndcharactermanager"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    // Устанавливаем JVM Target для Kotlin
    kotlinOptions {
        jvmTarget = "1.8"
    }

    // Включаем DataBinding
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.activity:activity-ktx:1.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
}




