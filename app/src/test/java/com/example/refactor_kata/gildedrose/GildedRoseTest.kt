package com.example.refactor_kata.gildedrose

import org.hamcrest.core.Is
import org.junit.Assert.assertThat
import org.junit.Test

class GildedRoseTest {

    @Test
    fun foo() {
        val items = arrayOf(Item("foo", 0, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertThat(app.items[0].name, Is.`is`("foo"))

    }


}