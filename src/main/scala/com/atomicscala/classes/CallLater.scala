package com.atomicscala.classes

class CallLater(val f: () => String) {
  def call(prefix:String):String = {prefix + f()}
}
