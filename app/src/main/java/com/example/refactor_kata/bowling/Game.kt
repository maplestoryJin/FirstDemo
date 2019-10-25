package com.example.refactor_kata.bowling

import com.example.refactor_kata.bowling.frame.IFrame
import com.example.refactor_kata.bowling.frame.NormalFrame
import com.example.refactor_kata.bowling.frame.SpareFrame
import com.example.refactor_kata.bowling.frame.StrikeFrame

class Game {
    private val frames = mutableListOf<IFrame>()
    private val rolls = mutableListOf<Int>()
    fun startFrame(firstRoll: Int, secondRoll: Int) {
        if (isLastFrame()) {
            rolls.add(firstRoll)
            rolls.add(secondRoll)
            return
        }
        when {
            isStrike(firstRoll) -> frames.add(
                StrikeFrame(
                    rolls
                )
            )
            isSpare(firstRoll, secondRoll) -> frames.add(
                SpareFrame(
                    rolls,
                    firstRoll,
                    secondRoll
                )
            )
            else -> frames.add(
                NormalFrame(
                    rolls,
                    firstRoll,
                    secondRoll
                )
            )
        }
    }

    private fun isLastFrame() = frames.size == 10

    fun score(): Int {
        return frames.sumBy {
            it.score()
        }

    }

    private fun isSpare(firstRoll: Int, secondRoll: Int) = firstRoll + secondRoll == 10

    private fun isStrike(firstRoll: Int) = firstRoll == 10

}
