// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.1.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.4")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.28.3-alpha")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    //HILT
    id("com.google.dagger.hilt.android") version "2.48" apply false
}


//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
