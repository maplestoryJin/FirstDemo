package com.example.firstdemo.bowling.frame

class SpareFrame(
    private val rolls: MutableList<Int>, firstRoll: Int, secondRoll: Int
) : IFrame {
    private val rollCount: Int

    init {
        rolls.add(firstRoll)
        rolls.add(secondRoll)
        rollCount = rolls.size
    }

    private fun nextScore(): Int {
        return rolls[rollCount]
    }

    override fun score(): Int {
        return 10 + nextScore()
    }

}
