package org.steinko.kotlin

import org.steinko.kotlin.MutableStack

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals

class MutableStackTest: Spek({

    Feature ("Testing of MutableStack"){
        var classUnderTest:  MutableStack<Int?>  =  MutableStack<Int?>() 
       
       Scenario ("Should be empty") {
    
         
               
          Then("should be empty"){
               classUnderTest = MutableStack<Int?>()
               var isEmpty = classUnderTest.isEmpty()
               assertTrue(isEmpty)             
           }
          
          Then("should be size 0") {   
               assertEquals(classUnderTest.size(), 0)
          }
      }
      Scenario("Should add a elemenet") { 
         
          When ("Add Item") {  
          
             classUnderTest.push(1)
          }
          
          Then("should not not be empty") { 
               assertFalse(classUnderTest.isEmpty())
           }
           
           Then("should contain a element") { 
               assertEquals(classUnderTest.size(),1)
           }
           
           Then("should contain the pushed element") {
           
                assertEquals(classUnderTest.peek(),1)
            }
              
      }
      
      Scenario("Should add another elemenet") { 
         
          When ("Add Item") {  
          
             classUnderTest.push(2)
          }
          
           
           Then("should contain the pushed element") {
           
                assertEquals(classUnderTest.peek(),2)
            }
              
      }
    }
})