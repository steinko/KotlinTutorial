package org.steinko.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

class HelloWorlTest : Spek({

    Feature("Hello World Tests ") {

        Scenario("Should display hello world") {

            var classUnderTest: App = App()
            var result: String = ""

                When("displays hello world") {
                    result = classUnderTest.greeting
                }

                Then("Produces Hello World") {
                    assertEquals(result, "Hello world.")
                }
        }
    }
})
    