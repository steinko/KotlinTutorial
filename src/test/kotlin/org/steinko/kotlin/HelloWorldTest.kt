package org.steinko.kotlin

import org.steinko.kotlin.App
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

class HelloWorlTest: Spek({
     given(" Display Hello Worl") {
           val classUnderTest = App()
           on("should display hello worl"){
              val result = classUnderTest.greeting
              it("Produces Hello World") {
                  assertEquals(result, "Hello world.")
           }
        }
    }
})
    