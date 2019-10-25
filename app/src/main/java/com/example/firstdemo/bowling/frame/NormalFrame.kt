package com.example.firstdemo.bowling.frame

class NormalFrame(rolls: MutableList<Int>, firstRoll: Int, secondRoll: Int) :
    IFrame {
    private var score: Int = firstRoll + secondRoll

    init {
        rolls.add(firstRoll)
        rolls.add(secondRoll)
    }

    override fun score(): Int {
        return score
    }
}

