package com.example.refactor_kata.bowling.frame

class StrikeFrame(private val rolls: MutableList<Int>) :
    IFrame {
    private var rollCount: Int

    init {
        rolls.add(10)
        rollCount = rolls.size
    }

    override fun score(): Int {
        return 10 + rolls[rollCount] + rolls[rollCount + 1]
    }

}
