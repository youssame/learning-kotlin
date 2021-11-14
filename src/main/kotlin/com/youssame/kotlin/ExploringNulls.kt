package com.youssame.kotlin

fun main () {
    // Creating variables that can contain a null value
    var name:String? = null
    name = null
    println(name)

    name = "yes"
    println(name)

    // The null-safe operator
    name = null
    println(name?.length)

    // The non-null asserted operator
    name = "test"
    println(name!!.uppercase())

    // The Nothing object type
    // The variable of type Nothing so it can never have a value
    var adresse = null;
    println(adresse)
}