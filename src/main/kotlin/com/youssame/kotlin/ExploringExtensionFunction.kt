package com.youssame.kotlin

fun String.toSentenceCase(): String {
    return this[0].uppercase() + this.substring(1);
}
fun main() {
    val greetings = "hello there"
    println(greetings.toSentenceCase())
}