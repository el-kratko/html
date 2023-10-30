import java.net.URI

plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { url = URI("https://jitpack.io") }
    mavenCentral()
}

val version_ksoup = "0.1.4"
dependencies {
    implementation("com.mohamedrejeb.ksoup:ksoup-html:$version_ksoup")
    // implementation("com.mohamedrejeb.ksoup:ksoup-entities:$version_ksoup")


    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}