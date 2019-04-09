package org.kotliner.demo.function

infix fun String.find(x: Int): Char {
    return this[x]
}

fun main() {
    val c = "Hello World" find 2
    println(c)
}