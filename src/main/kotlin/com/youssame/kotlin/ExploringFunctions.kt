package com.youssame.kotlin

// Single expression functions
fun addTwoNumbers(n1: Double, n2: Double) = n1 + n2

fun someMath(n1: Double, n2: Double) {
    println("n1 + n2 = ${n1 + n2}")
    println("n1 - n2 = ${n1 - n2}")
}
fun main() {
    println(addTwoNumbers(1.2, 4.4))

    // Using named parameters and optional parameters
    someMath(n2 = 4.5, n1 = 2.3)

}
