package com.atomicscala

import org.scalatest.{Matchers, FlatSpec}

class StringInterpolationSpec extends FlatSpec with Matchers {

  val s = "name: mark, age: 30, height: 180.5"
  val si = new StringInterpolation

  val result = si.i("mark", 30, 180.5)
  result should be (s)

  val result2 = si.j("mark", 30, 180.5)
  result2 should be (s)

}
