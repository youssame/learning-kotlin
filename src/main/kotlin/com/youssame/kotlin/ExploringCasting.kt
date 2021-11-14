package com.youssame.kotlin

fun main() {
    val myInt   = 13;
    val myDouble: Double   = myInt as Double;

    val intString: String = String.format("%d", myInt)

    println(
        """
            intString is a ${intString::class::simpleName}
            myDouble is a ${myDouble::class::simpleName}
        """.trimIndent()
    );
}