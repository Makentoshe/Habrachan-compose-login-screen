plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
    }
}
allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}