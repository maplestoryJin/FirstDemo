package com.example.refactor_kata.gildedrose

class BackstageItem(sellIn: Int, quality: Int) :
    Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) {
    override fun updateQualityAfterExpire() {
        quality = 0
    }

    override fun updateQuality() {
        qualityIncrease()

        if (sellIn < 10) {
            qualityIncrease()
        }

        if (sellIn < 5) {
            qualityIncrease()
        }
    }

    override fun updateSellInDays() {
        sellDecrease()
    }
}
