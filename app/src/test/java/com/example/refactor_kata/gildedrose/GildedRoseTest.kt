package com.example.refactor_kata.gildedrose

import org.hamcrest.core.Is
import org.junit.Assert.assertThat
import org.junit.Test

class GildedRoseTest {

    @Test
    fun foo() {
        val items = arrayOf(NormalItem("foo", 0, 0))
        val app = GildedRose(items)
        app.passOneDay()
        assertThat(app.items[0].name, Is.`is`("foo"))

    }

    @Test
    fun test_backstage_pass_one_day() {
        val item = BackstageItem(11, 20)
        item.passOneDay()
        assertThat(item.quality, Is.`is`(21))
        item.passOneDay()
        assertThat(item.quality, Is.`is`(23))
    }

    @Test
    fun test_normal_item_expire() {
        val item = NormalItem("hua", 1, 10)
        item.passOneDay()
        assertThat(item.quality, Is.`is`(9))
        item.passOneDay()
        assertThat(item.quality, Is.`is`(7))
    }

    @Test
    fun test_conjured_item() {

        val item = ConjuredItem(3, 6)
        item.passOneDay()
        assertThat(item.quality, Is.`is`(4))
    }
}