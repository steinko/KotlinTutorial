package org.steinko.kotlin

import org.steinko.kotlin.MutableStack

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

import org.junit.jupiter.api.Assertions.assertTrue

class MutableStackTest: Spek({

    Feature ("Testing of MutableStack"){
       Scenario ("Should be empty") {
    
           val classUnderTest: MutableStack<Int>  = MutableStack<Int>()
               
          Then("should be empty"){
               assertTrue(classUnderTest.isEmpty())             
           }
      }
    }
})