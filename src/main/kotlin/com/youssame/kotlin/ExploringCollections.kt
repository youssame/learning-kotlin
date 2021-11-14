package com.youssame.kotlin

fun main() {
    // Immutable lists
    val colors = listOf("red", "blue", "green")
    println(colors::class.qualifiedName)
    println(
        colors.filter { it -> it !== "red" }
    )

    // Mutable lists
    val days = mutableListOf("Monday", "Tuesday", "Sunday")
    val numbers = mutableListOf<Int>(1, 2, 3, 4)

    // Maps and sets
    val months = mutableSetOf("Jan", "Feb")
    val map = mapOf("d" to "Dr", "gd" to "Good")

    // Working with arrays
    val intArray:IntArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.set(0, 0)
    intArray[2] = 43
    intArray.forEach { println(it) }
}