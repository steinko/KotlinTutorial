package org.steinko.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

class YorkshireTest : Spek({
    Feature("Yorkshire Tests ") {
        Scenario("Should display wif wif") {
            val classUnderTest: Dog = Yorkshire()

                Then("displays wif wif") {
                    assertEquals(classUnderTest.sayHello(), "wif wif!")
                }
        }
    }
})
