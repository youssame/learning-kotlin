package com.youssame.kotlin

interface Animal {
    val name: String
    fun isSafe(): Boolean
    fun isAvailable() = true
}

class BadCodeException: Throwable() {
}

open class Cat(val code: String): Animal {
    override val name = "Mimi"
    override fun isSafe(): Boolean {
        return true
    }
    init {
        if (code == "")
            throw BadCodeException()
    }
}

class Cat2 : Cat("c") {

}

fun main() {
    println(Cat2().isAvailable())
}