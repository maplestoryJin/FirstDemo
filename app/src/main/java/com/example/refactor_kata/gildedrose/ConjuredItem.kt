package com.example.refactor_kata.gildedrose

class ConjuredItem(sell: Int, quality: Int) : Item("Conjured Mana Cake", sell, quality) {
    override fun updateSellInDays() {
        sellIn--
    }

    override fun updateQualityAfterExpire() {
        qualityDecrease()
    }

    override fun updateQuality() {
        qualityDecrease()
        qualityDecrease()
    }

}
