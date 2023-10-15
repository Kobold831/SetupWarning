plugins {
    id("com.android.application")
}

android {
    namespace = "com.saradabar.setupwarning"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.saradabar.setupwarning"
        minSdk = 22
        //noinspection ExpiredTargetSdkVersion
        targetSdk = 22
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
}