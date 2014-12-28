package com.atomicscala

class StringInterpolation {
  def i (s:String, n:Int, d:Double):String = {
    s"name: $s, age: $n, height: $d"
  }

  def j (s:String, n:Int, d:Double) = s"name: $s, age: $n, height: $d"
}
