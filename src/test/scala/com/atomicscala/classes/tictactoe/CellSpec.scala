package com.atomicscala.classes.tictactoe

import org.scalatest.{FlatSpec, Matchers}

class CellSpec extends FlatSpec with Matchers {

  "A cell" should "---" in {

    val grid = new Grid
    grid.play('X', 1, 1) should be ("successful move")
    grid.play('X', 1, 1) should be ("invalid move")
    grid.play('O', 1, 3) should be ("invalid move")
  }

}
