package com.atomicscala.functions

class DisplayVector {
  def addArrows(ints: Vector[Int]) = {
    ints.map(n => s"-> ${n}")
  }
}
