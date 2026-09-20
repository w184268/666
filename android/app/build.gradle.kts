plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.kid.watchbridge"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kid.watchbridge"
        minSdk = 26
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

// 零第三方依赖：只用标准库 + HttpURLConnection，避免联网拉包失败的尴尬
dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
}
