package com.atomicscala.classes

import org.scalatest.{Matchers, FlatSpec}

class CallLaterSpec extends FlatSpec with Matchers {
  val cl = new CallLater(() => "suffix")
  val result = cl.call("prefix")

  result should be ("prefixsuffix")
}
