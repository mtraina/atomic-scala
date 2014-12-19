package com.atomicscala.functions

import org.scalatest.{Matchers, FlatSpec}

class DisplayVectorSpec extends FlatSpec with Matchers {

  "A display vector" should "print each elements of a vector" in {
    val dv = new DisplayVector
    val v = Vector(1,2,3,4)
    v.foreach(dv.show)
  }
}
