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
		Item("+5 Dexterity Vest", 10, 20), //
		Item("Aged Brie", 2, 0), //
		Item("Elixir of the Mongoose", 5, 7), //
		Item("Sulfuras, Hand of Ragnaros", 0, 80), //
		Item("Sulfuras, Hand of Ragnaros", -1, 80),
		Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
		Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
		Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
		// this conjured item does not work properly yet
		Item("Conjured Mana Cake", 3, 6)
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
