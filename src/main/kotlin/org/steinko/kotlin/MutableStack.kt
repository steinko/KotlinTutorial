package org.steinko.kotlin

class MutableStack<E> (vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    fun peek(): E = elements.last()
}
