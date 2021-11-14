package com.youssame.kotlin

import java.io.FileInputStream
import java.lang.Exception

@Throws (InterruptedException::class)
fun divide(a: Int, b:Int): Double {
    Thread.sleep(1000)
    return (a.toDouble() / b)
}

fun printFile() {
    val fileInput = FileInputStream("file.txt")
    fileInput.use {
        // if an exception is thrown here the file stream will be closed
    }
}

fun main() {
    val result = try {
        divide(1, 2)
    } catch (e: Exception) {
        println("Exception : $e")
        0
    }
    println("result : $result")
}