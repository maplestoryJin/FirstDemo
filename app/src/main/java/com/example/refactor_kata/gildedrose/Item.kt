package com.example.refactor_kata.gildedrose

abstract class Item(var name: String, var sellIn: Int, var quality: Int) {


    abstract fun updateQualityAfterExpire()

    abstract fun updateQuality()

    abstract fun updateSellInDays()


    fun passOneDay() {
        updateSellInDays()
        updateQuality()
        if (isExpire()) {
            updateQualityAfterExpire()
        }
    }


    private fun isExpire() = sellIn < 0

    protected fun sellDecrease() {
        sellIn--
    }

    override fun toString(): String {
        return "Item(name=$name, sellIn=$sellIn, quality=$quality)"
    }

    protected fun qualityIncrease() {
        if (quality < 50) {
            quality += 1
        }
    }

    protected fun qualityDecrease() {
        if (quality > 0) {
            quality -= 1
        }
    }


}