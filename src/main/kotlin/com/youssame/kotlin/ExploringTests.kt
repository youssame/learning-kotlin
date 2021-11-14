package com.youssame.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class Sample {
    fun sum(a: Int, b:Int): Int {
        if (a == 0 && b == 0) throw IllegalArgumentException()
        return a + b
    }
}

class SampleTest {
    @Test
    fun CorrectSum() {
        assertEquals(7, Sample().sum(3, 4))
    }

    @Test
    fun sumException() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            Sample().sum(0, 0)
        }
    }
}