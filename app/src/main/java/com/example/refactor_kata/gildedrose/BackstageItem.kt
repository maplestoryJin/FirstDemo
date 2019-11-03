package com.example.refactor_kata.gildedrose

class BackstageItem(sell: Int, quality: Int) :
    Item("Backstage passes to a TAFKAL80ETC concert", sell, quality) {
    override fun updateSellInDays() {
        sellIn--
    }

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
}
