//import java.util.*

plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

android {
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE*")
        exclude("META-INF/NOTICE*")
        exclude("META-INF/*.kotlin_module")
    }
    compileSdk = Build.androidCompileSdk
    buildToolsVersion = Build.andoridBuildTools

    defaultConfig {
        applicationId = Build.applicationId
        minSdk = Build.androidMinimumSdk
        targetSdk = Build.androidTargetSdk
        versionCode = Build.applicationVersionCode
        versionName = Build.applicationVersionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        compose = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            applicationIdSuffix = ".debug"
        }
    }
    lintOptions {
        this.isAbortOnError = false
    }
    kotlinOptions {
        // for inlining bytecode for some methods
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerVersion = Build.kotlinPluginVersion
        kotlinCompilerExtensionVersion = Version.compose
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // System ui color
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")

    implementationKtorClient(version = Version.ktor)

    implementationCompose(
        composeUiVersion = Version.compose,
        composeActivityVersion = Version.composeActivity,
        composeNavigationVersion = Version.composeNavigation,
        composeAccompanistVersion = Version.composeAccompanist,
    )

    implementationAndroid(
        coreVersion = Version.androidCore,
        lifecycleVersion = Version.androidLifecycle,
        appcompatVersion = Version.androidAppcompat,
        materialVersion = Version.androidMaterial,
        constraintVersion = Version.androidConstraint,
    )

    testImplementationJunit(version = Version.junit)
}