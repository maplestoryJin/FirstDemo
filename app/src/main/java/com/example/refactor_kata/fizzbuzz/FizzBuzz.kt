package com.example.refactor_kata.fizzbuzz

class FizzBuzz(private val i: Int) {
    fun of(): String {
        if (isDivisibleBy(3) && isDivisibleBy(5)) {
            return "fizzbuzz"
        }
        if (isDivisibleBy(3)) {
            return "fizz"
        }
        if (isDivisibleBy(5)) {
            return "buzz"
        }

        return i.toString()
    }

    private fun isDivisibleBy(num: Int) = i % num == 0
}
