package org.steinko.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

class DogTest : Spek({

    Feature("Yorkshire Tests ") {

        Scenario("Should display wow wow!") {

            val classUnderTest: Dog = Dog()

                Then("displays wow wow") {
                    assertEquals(classUnderTest.sayHello(), "wow wow!")
                }
            }
    }
})
