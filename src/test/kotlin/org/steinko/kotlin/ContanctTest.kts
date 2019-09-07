package org.steinko.kotlin

import org.steinko.kotlin.Contact

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature


import org.junit.jupiter.api.Assertions.assertEquals

object ContactTest: Spek({
   Feature("Contac Tests")  {
   
      val classUnderTest by memoized { Contact(1, "mary@gmail.com") }
      
      Scenario( "Test Id") {
         
         var id: Int = 0
              
          When("should display 1 as id"){
               id = classUnderTest.id
          }
              
          Then ("Produces 1") {
                  assertEquals(id, 1)
          }
       }
        
       Scenario ("Test Mail"){
          
          var email: String = ""
             
          When ("should display email mary@gmail.com") {    
                email = classUnderTest.email
          } 
                
          Then ("Produces mary@gmail.com") {
                  assertEquals(email, "mary@gmail.com")
          }
        }
     }
})