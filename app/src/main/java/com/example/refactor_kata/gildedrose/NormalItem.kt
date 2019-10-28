package com.example.refactor_kata.gildedrose

class NormalItem(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {
    override fun updateQualityAfterExpire() {
        qualityDecrease()
    }

    override fun updateQuality() {
        qualityDecrease()
    }

    override fun updateSellInDays() {
        sellDecrease()
    }
}
