package net.micg.lab1.model

import net.micg.lab1.R

enum class Result(val resourceStringId: Int) {
    PLAYER_WIN(R.string.you_win),
    COMPUTER_WIN(R.string.computer_win),
    DRAW(R.string.draw)
}