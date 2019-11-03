package com.example.refactor_kata.gildedrose

class GildedRose(var items: Array<out Item>) {

    fun passOneDay() {
        items.forEach { item ->
            item.passOneDay()
        }
    }
}