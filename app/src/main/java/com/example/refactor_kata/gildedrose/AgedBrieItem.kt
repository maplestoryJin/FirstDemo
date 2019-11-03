package com.example.refactor_kata.gildedrose

class AgedBrieItem(sell: Int, quality: Int) : Item("Aged Brie", sell, quality) {
	override fun updateSellInDays() {
		sellIn--
	}

	override fun updateQualityAfterExpire() {
		qualityIncrease()
	}

	override fun updateQuality() {
		qualityIncrease()
	}

}
