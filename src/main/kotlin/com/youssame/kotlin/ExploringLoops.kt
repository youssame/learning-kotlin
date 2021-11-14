package com.youssame.kotlin

import com.youssame.exercises.exercise1.Person.Person

fun main() {
//    var x = 0
//
//    while (x < 10) {
//        println(x)
//        x++
//    }
    var people = ArrayList<Person>()
    people.add(Person(1, "title 1", "Youssef", "youssame", null))
    people.add(Person(2, "title 3", "Youssef 2", "youssame2", null))
    people.add(Person(3, "title 3", "Youssef 3", "youssame3", null))
    for ((id, firstname) in people) {
        println("$id - $firstname")
    }
    for ((key, value) in people) {
        println("$key - ${value.toString()}")
    }
    // Range
    for (i in 0..9)
        println(i)
    (0..5).forEach{ i -> println("Index = $i") }
    println("¨¨");
    (5 downTo 0).forEach{ i -> println("Index = $i") }
    println("¨¨");
    (0 until 5).forEach{ i -> println("Index = $i") }
    println("¨¨");
    (0 .. 12 step 2).forEach{ i -> println("Index = $i") }

}
