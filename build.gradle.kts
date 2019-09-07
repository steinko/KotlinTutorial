plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.50"

    // Apply the application plugin to add support for building a CLI application.
    application
    java
}

repositories {
    mavenCentral()
     jcenter()
    
    // add Spek 2 development repository
    maven { url = uri( "https://dl.bintray.com/spekframework/spek/") }
}

val kotlinVersion = "1.3.50"
val spekVersion = "1.1.5"
val spek2Version = "2.0.7"

dependencies {
  
    // include Kotlin standard library
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation ("org.jetbrains.kotlin:kotlin-script-runtime:$kotlinVersion")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
    
    // include JUnit 5 assertions
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testImplementation ("org.spekframework.spek2:spek-dsl-jvm:$spek2Version")
    testRuntimeOnly ("org.spekframework.spek2:spek-runner-junit5:$spek2Version")

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


