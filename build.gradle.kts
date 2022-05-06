plugins {
    id("org.jetbrains.kotlin.jvm") version Build.kotlinPluginVersion
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Build.androidGradlePluginVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Build.kotlinPluginVersion}")
    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}