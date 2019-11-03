package com.example.refactor_kata.gildedrose

abstract class Item(var name: String, var sellIn: Int, var quality: Int) {

    abstract fun updateQuality()
    abstract fun updateQualityAfterExpire()
    abstract fun updateSellInDays()

    fun passOneDay() {
        updateSellInDays()
        updateQuality()
        if (isExpire()) {
            updateQualityAfterExpire()
        }
    }

    private fun isExpire() = sellIn < 0

    protected fun qualityIncrease() {
        if (quality < 50) {
            quality++
        }
    }

    protected fun qualityDecrease() {
        if (quality > 0) {
            quality--
        }
    }

    override fun toString(): String {
        return "Item(name=$name, sellIn=$sellIn, quality=$quality)"
    }

}