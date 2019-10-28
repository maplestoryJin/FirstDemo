package com.example.refactor_kata.gildedrose

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun main(args: Array<String>) {
	var days = 2
	if (args.isNotEmpty()) {
		days = Integer.parseInt(args[0]) + 1
	}
	print(result(days))

}

fun result(days: Int): String {
	val out = ByteArrayOutputStream(1024)
	val printStream = PrintStream(out)
	printStream.println("OMGHAI!")

	val items = arrayOf(
		NormalItem("+5 Dexterity Vest", 10, 20), //
		AgedBrieItem(2, 0), //
		NormalItem("Elixir of the Mongoose", 5, 7), //
		SulfurasItem(0, 80), //
		SulfurasItem(-1, 80),
		BackstageItem(15, 20),
		BackstageItem(10, 49),
		BackstageItem(5, 49),
		// this conjured item does not work properly yet
		NormalItem("Conjured Mana Cake", 3, 6)
	)

	val app = GildedRose(items)


	for (i in 0 until days) {
		printStream.println("-------- day $i --------")
		printStream.println("name, sellIn, quality")
		for (item in items) {
			printStream.println(item)
		}
		printStream.println()
		app.updateQuality()
	}

	return out.toString()
}
