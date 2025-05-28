plugins {
    id("java")
    kotlin("jvm")
    kotlin("kapt") version "2.0.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

version = "3"

kotlin {
    jvmToolchain(8)
}

java {
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("com.google.auto.service:auto-service:1.1.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.21")

    // CommonMark (Markdown)
    implementation("org.commonmark:commonmark:0.21.0")
    implementation("org.commonmark:commonmark-ext-autolink:0.21.0")
    implementation("org.commonmark:commonmark-ext-task-list-items:0.21.0")

    implementation("com.charleskorn.kaml:kaml-jvm:0.56.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.6.2")
    implementation("org.json:json:20231013")

    implementation(project(":annotations"))
}

tasks.shadowJar {
    archiveClassifier.set("")
    minimize()
}