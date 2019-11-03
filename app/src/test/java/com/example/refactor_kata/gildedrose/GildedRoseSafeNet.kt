package com.example.refactor_kata.gildedrose

import com.example.refactor_kata.gildedrose.TexttestFixture.result
import org.hamcrest.core.Is
import org.junit.Assert.assertThat
import org.junit.Test
import java.io.File

class GildedRoseSafeNet {
	@Test
	fun test_result_equals() {
		val baseline = File("src/test/baseline.txt").readText()
		assertThat(result(2), Is.`is`(baseline))
	}
}
