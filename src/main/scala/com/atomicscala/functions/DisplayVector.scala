package com.atomicscala.functions

class DisplayVector {
  def show(n:Int):Unit = {println("> " + n)}

  def sort(v:Vector):Vector = {
    //v.sortWith((i,j) => i < j)
    v
  }
}
