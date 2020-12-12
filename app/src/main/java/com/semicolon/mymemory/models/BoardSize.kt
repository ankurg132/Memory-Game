package com.semicolon.mymemory.models

enum class BoardSize(val numCards: Int) {
  EASIEST(6),
  EASY(8),
  MEDIUM(12),
  HARD(18),
  HARDEST(24);

  companion object {
    fun getByValue(value: Int) = values().first { it.numCards == value }
  }

  fun getWidth(): Int {
    return when (this) {
      EASIEST -> 2
      EASY -> 2
      MEDIUM -> 3
      HARD -> 3
      HARDEST -> 4
    }
  }

  fun getHeight(): Int {
    return numCards / getWidth()
  }

  fun getNumPairs(): Int {
    return numCards / 2
  }
}