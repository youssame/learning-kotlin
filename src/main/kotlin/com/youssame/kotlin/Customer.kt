package com.youssame.kotlin

// The class declaration and class-level attributes
class Customer(val name: String, val address:String, val age: Int) {
    constructor(name: String, age: Int) : this(name, "", age) {
        println("secondary constructor")
    }
    init {
        println("primary constructor")
    }
}

class AlternativeCustomer(name: String, age: Int) {
    var address: String
    init {
        address = ""
    }
    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }
}
class AnotherAlternativeCustomer(var name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false
    set(value) {
        if(age >= 21)
            field = true
        else
            println("You can't approve this user")
    }
    get () {
        return field
    }

    val nextAge = age + 1
    get() = field

    fun nameToUpperCase() =
        name.uppercase()

    override fun toString(): String {
        return "${name}, ${age} years old, ${address}"
    }
    companion object {
        fun getInstance() = AnotherAlternativeCustomer("USER NAME", 30, "ADDRESSE")
    }
}

data class User(val name: String, val age: Int) {

}

fun main() {
    val customer = AnotherAlternativeCustomer("Youssef", 21, "Marrakech")
    customer.approved = true
    println(customer.approved)
    println(customer.nextAge)
    println(customer.nameToUpperCase())
    println(customer.toString())
    println(AnotherAlternativeCustomer.getInstance())

    val user = User("Yususf", 27)
    val user2 = user.copy(name = "Yahya")
    println(user2)
    val (name, adress) = user
    println("${name} ${adress}")
}