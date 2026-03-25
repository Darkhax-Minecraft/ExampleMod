buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.google.code.gson:gson:2.13.2")
    }
}

plugins {
    id("java")
    id("net.darkhax.mmc") version "26.1.0.18-beta"
}

group = "net.darkhax.test"
version = "0.0.7"

repositories {
    mavenCentral()
    mavenLocal()
}