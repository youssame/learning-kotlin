package com.youssame.exercises.exercise1.Person

import java.util.*

data class Person(val id: Long,
                  val title: String,
                  val firstname: String,
                  val surname: String,
                  val dateOfBirth: Calendar?) {

    override fun toString() = "$title - $firstname - $surname"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Person) return false
        return id == other.id &&
                title == other.title &&
                firstname == other.firstname &&
                surname == other.surname &&
                dateOfBirth == other.dateOfBirth
    }

    override fun hashCode() = Objects.hash(id, title, firstname, surname, dateOfBirth)

    var favoriteColor: String? = null
    fun getUpperCaseColor(): String {
        return favoriteColor?.uppercase() ?: ""
    }

    fun getLastLetter(s: String) = s.takeLast(1)

    fun getColorLastLetter(): String {
        return favoriteColor?.let {getLastLetter(it)} ?: ""
    }

    fun getColorType(): String {
        val color = getUpperCaseColor()
        return when(color) {
            "" -> "empty"
            "RED", "BLUE", "GREEN" -> "rgb"
            else -> "other"
        }
    }

    val age: Int?
        get() = getAge(dateOfBirth)

    val safeAge: Int
        get() {
            val localAge = age;
            return localAge ?: -1
        }
    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth === null) return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.YEAR) >= today.get(Calendar.YEAR)) -1 else years

        }
    }
}

fun main() {
    val youssef = Person(1, "Me", "Youssef", "youssame", GregorianCalendar(1993,5,20))
    println("Youssef is ${youssef.toString()}")
    println("Youssef age is ${youssef.age}")
    println("Youssef safeAge is ${youssef.safeAge}")
    youssef.favoriteColor = "Blue"
    println("Youssef getColorLastLetter is ${youssef.getColorLastLetter()}")
    println("Youssef getColorType is ${youssef.getColorType()}")
}