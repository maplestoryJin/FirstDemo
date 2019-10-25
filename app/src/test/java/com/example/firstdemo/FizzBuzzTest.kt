package com.example.firstdemo

import com.example.refactor_kata.FizzBuzz
import org.hamcrest.core.Is
import org.junit.Assert.assertThat
import org.junit.Test


class FizzBuzzTest {
    @Test
    fun should_print_number_when_given_real_number() {
        checkNumber(1, "1")
        checkNumber(2, "2")
    }

    @Test
    fun should_print_fizz_when_given_number_divisible_three() {
        checkNumber(3, "fizz")
    }

    @Test
    fun should_print_buzz_when_given_number_divisible_five() {
        checkNumber(5, "buzz")
    }

    @Test
    fun should_print_fizz_buzz_when_given_number_divisible_three_and_five() {
        checkNumber(15, "fizzbuzz")
    }

    private fun checkNumber(i: Int, excepted: String) {
        assertThat(FizzBuzz(i).of(), Is.`is`(excepted))
    }
}
