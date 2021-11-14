package com.youssame.kotlin

fun main() {
    //  val is for an immutable variable and var is fore a mutable or changeable variable.
    var name = "Youssef"
    val surname = "youssame"

    // String templates
    println("$name @$surname")
    println("the length of $name surname is ${surname.length}")

    // Multiple line strings
    // Wen can create multi-line strings in Kotlin and we do that by starting and ending our strings with three double
    // quote symbols.
    val story = """
        |This is my story
        |that you should know it
    """.trimMargin("|")
    println("$story")
    println("${story.replaceAfterLast("that", " that not")}")

    // Using the Double type and determining class types
    val myDouble = 3.45
    println("Is myDouble is a Double? ${myDouble is Double}")
    println("myDouble is a Double? ${myDouble::class::qualifiedName}")

    // The Int data type
    val myInt: Int = 12

    // Other data types
    // in order to assign a float value you will need to follow it with the letter F just like we do in java.
    val myFloat: Float = 12.4f

}