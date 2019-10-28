package com.example.refactor_kata.gildedrose

class AgedBrieItem(sellIn: Int, quality: Int) : Item("Aged Brie", sellIn, quality) {
    override fun updateQualityAfterExpire() {
        qualityIncrease()
    }

    override fun updateQuality() {
        qualityIncrease()
    }

    override fun updateSellInDays() {
        sellDecrease()
    }
}
