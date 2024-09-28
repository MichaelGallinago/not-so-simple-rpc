package ru.sug4chy.homework2109.model

import ru.sug4chy.homework2109.R

enum class Result(val resourceStringId: Int) {
    PLAYER_WIN(R.string.you_win),
    COMPUTER_WIN(R.string.computer_win),
    DRAW(R.string.draw)
}