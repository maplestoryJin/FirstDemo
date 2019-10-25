package com.example.firstdemo

import com.example.firstdemo.bowling.Game
import org.hamcrest.core.Is
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

/*
* 保龄球游戏
* 规则：
* 1. 总共进行10次游戏。每次游戏有两次机会击倒10个瓶子。
* 2. 游戏的总分计算公式：总分=击倒的瓶子总数 + 全中的奖励分数 + 补中的奖励分数
* 3. 全中奖励分数是接下来两次击倒的瓶子的总数。（全中指第一次就击倒10个瓶子, 不能再投掷第二次）
* 4. 补中奖励分数是接下来一次击倒的瓶子数。（补中就是两次一共击倒10个瓶子）
* 5. 最后一次（第10次）游戏，玩家如果是全中，则继续完成两次投掷，如果是补中，则完成最后一次投掷。即全中和补中需要投掷三次。否则只有两次投掷机会。
* */
class BowlingGameTest {
    private lateinit var game: Game

    @Before
    fun setUp() {
        game = Game()
    }

    private fun manyFrames(count: Int, pins: Int) {
        for (i in 1..count) {
            game.startFrame(pins, pins)
        }
    }

    @Test
    fun test_gutter_game() {
        manyFrames(10, 0)
        assertThat(game.score(), Is.`is`(0))
    }

    @Test
    fun test_all_ones() {
        manyFrames(10, 1)
        assertThat(game.score(), Is.`is`(20))
    }

    @Test
    fun test_one_spare() {
        game.startFrame(4, 6)
        game.startFrame(3, 0)
        manyFrames(8, 0)
        assertThat(game.score(), Is.`is`(16))
    }

    @Test
    fun test_other_one_spare() {
        game.startFrame(4, 6)
        game.startFrame(5, 3)
        manyFrames(8, 0)
        assertThat(game.score(), Is.`is`(23))
    }

    @Test
    fun test_one_strike() {
        game.startFrame(10, 0)
        game.startFrame(3, 4)
        manyFrames(8, 0)
        assertThat(game.score(), Is.`is`(24))
    }

    @Test
    fun test_perfect_game() {
        manyFrames(12, 10)
        assertThat(game.score(), Is.`is`(300))
    }

    @Test
    fun test_all_spare() {
        manyFrames(10, 5)
        game.startFrame(5, 0)
        assertThat(game.score(), Is.`is`(150))
    }

    @Test
    fun test_alternating() {
        for (i in 1..5) {
            game.startFrame(4, 6)
            game.startFrame(10, 0)
        }
        game.startFrame(10, 0)
        assertThat(game.score(), Is.`is`(200))
    }
}
