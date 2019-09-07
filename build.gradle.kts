plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.41"

    // Apply the application plugin to add support for building a CLI application.
    application
    java
}

repositories {
    mavenCentral()
     jcenter()
    
    // add Spek 2 development repository
    maven { url = uri( "https://dl.bintray.com/spekframework/spek-dev") }
}

dependencies {

    // include Kotlin standard library
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.3.50")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:1.3.50")
    implementation ("org.jetbrains.kotlin:kotlin-script-runtime:1.3.50")
    
    // include JUnit 5 assertions
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testImplementation  ("org.jetbrains.spek:spek-api:1.1.5")
    testImplementation  ("org.jetbrains.spek:spek-subject-extension:1.1.5")
    testImplementation  ("org.jetbrains.spek:spek-junit-platform-engine:1.1.5")

    // include JUnit 5 test engine
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.2.0") 
}

tasks {
    // Use the built-in JUnit support of Gradle.
    "test"(Test::class) {
        useJUnitPlatform()
    }
}

application {
    // Define the main class for the application
    mainClassName = "org.steinko.kotlin.AppKt"
}
