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
    compileSdkVersion(properties["version.android.sdk.compile"].toString().toInt())
    defaultConfig {
        applicationId = "com.makentoshe.habrachan.onboarding"
        minSdkVersion(properties["version.android.sdk.minimum"].toString().toInt())
        targetSdkVersion(properties["version.android.sdk.target"].toString().toInt())
        versionCode = properties["version.android.sdk.version.code"].toString().toInt()
        versionName = properties["version.android.sdk.version.name"].toString()
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
    kotlinOptions {
        // for inlining bytecode for some methods
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerVersion = properties["version.kotlin"].toString()
        kotlinCompilerExtensionVersion = properties["version.androidx.compose"].toString()
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Ktor client
    val ktorHttpClientVersion = "2.0.0"
    implementation("io.ktor:ktor-client-core:$ktorHttpClientVersion")
    implementation("io.ktor:ktor-client-cio:$ktorHttpClientVersion")

    // Jetpack Compose
    // https://developer.android.com/jetpack/compose/setup
    val composeVersion = properties["version.androidx.compose"]
    val composeActivityVersion = properties["version.androidx.compose.activity"]
    val composeNavigationVersion = properties["version.androidx.compose.navigation"]
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.activity:activity-compose:$composeActivityVersion")
    implementation("androidx.navigation:navigation-compose:$composeNavigationVersion")

    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:$composeVersion")
    // Material Design
    implementation("androidx.compose.material:material:$composeVersion")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
    // System ui color
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")

    val lifecycleVersion = properties["version.androidx.lifecycle"]
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")

    val coreVersion = properties["version.androidx.core"]
    implementation("androidx.core:core-ktx:$coreVersion")

    val appcompatVersion = properties["version.androidx.appcompat"]
    implementation("androidx.appcompat:appcompat:$appcompatVersion")

    val materialVersion = properties["version.google.material"]
    implementation("com.google.android.material:material:$materialVersion")

    val constraintLayoutVersion = properties["version.androidx.constraint"]
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")

    val junitVersion = properties["version.junit"]
    testImplementation("junit:junit:$junitVersion")

}