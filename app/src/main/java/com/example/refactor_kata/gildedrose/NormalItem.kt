package com.example.refactor_kata.gildedrose

class NormalItem(name: String, sell: Int, quality: Int) : Item(name, sell, quality) {
    override fun updateSellInDays() {
        sellIn--
    }

    override fun updateQualityAfterExpire() {
        qualityDecrease()
    }

    override fun updateQuality() {
        qualityDecrease()
    }

}
