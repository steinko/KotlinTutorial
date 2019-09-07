package org.steinko.kotlin

import org.steinko.kotlin.Contact
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

class ContactTest: Spek({
     given(" should test Contact") {
           val classUnderTest = Contact(1, "mary@gmail.com")
           on("should display 1 as id"){
              val id = classUnderTest.id
              it("Produces 1") {
                  assertEquals(id, 1)
              }
           }
           
           on ("should display email mary@gmail.com"){
           val email = classUnderTest.email
              it("Produces mary@gmail.com") {
                  assertEquals(email, "mary@gmail.com")
              }
           }
      }
})