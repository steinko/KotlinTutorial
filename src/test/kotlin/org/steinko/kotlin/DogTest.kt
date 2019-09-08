package org.steinko.kotlin

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

import org.junit.jupiter.api.Assertions.assertEquals

class DogTest: Spek({

   Feature("Yorkshire Tests ") {
       
       Scenario( "Should display wow wow!") {
          
         val  classUnderTest: Dog =  Dog()
           
           Then ("displays wow wow") {
                  assertEquals(classUnderTest.sayHello(), "wow wow!")
           }
        }
    }
})
  
  