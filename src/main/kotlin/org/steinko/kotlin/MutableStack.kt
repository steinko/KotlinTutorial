package org.steinko.kotlin

class MutableStack<E> (vararg items: E) {  
   private val elements = items.toMutableList()
   
   fun isEmpty() = elements.isEmpty()


}
