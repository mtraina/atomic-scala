package com.atomicscala.functions

import org.scalatest.{Matchers, FlatSpec}

class DisplayVectorSpec extends FlatSpec with Matchers {
  val dv = new DisplayVector
  val result = dv.addArrows(Vector(1,2,3,4))

  result should be ("-> 1", "-> 2", "-> 3", "-> 4")
}
