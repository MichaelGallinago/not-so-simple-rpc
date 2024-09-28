package net.micg.lab1.utils

import net.micg.lab1.model.Shape
import net.micg.lab1.model.Result

object RockPaperScissors {

    fun getResult(playerVariant: Shape, computerVariant: Shape) = when (playerVariant) {
        Shape.ROCK -> when (computerVariant) {
            Shape.SCISSORS -> Result.PLAYER_WIN
            Shape.ROCK -> Result.DRAW
            Shape.PAPER -> Result.COMPUTER_WIN
        }

        Shape.PAPER -> when (computerVariant) {
            Shape.ROCK -> Result.PLAYER_WIN
            Shape.PAPER -> Result.DRAW
            Shape.SCISSORS -> Result.COMPUTER_WIN
        }

        Shape.SCISSORS -> when (computerVariant) {
            Shape.PAPER -> Result.PLAYER_WIN
            Shape.SCISSORS -> Result.DRAW
            Shape.ROCK -> Result.COMPUTER_WIN
        }
    }
}