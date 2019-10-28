package com.example.refactor_kata.gildedrose

class GildedRose(var items: Array<out Item>) {

    fun updateQuality() {
        items.forEach { item ->
            item.passOneDay()
        }
    }
}