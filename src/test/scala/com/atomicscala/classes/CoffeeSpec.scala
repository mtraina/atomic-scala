package com.atomicscala.classes

import org.scalatest.{FlatSpec, Matchers}

class CoffeeSpec extends FlatSpec with Matchers {

  "A coffee" should "contains the right ingredients" in {

    val usual = new Coffee
    usual.result should be ("HereCup shot shot ")
    usual.shots should be (2)

    val mocha = new Coffee(decaf = true, toGo =  true, syrup = "Chocolate")
    mocha.result should be ("ToGoCup decaf shot decaf shot Chocolate")

  }

}
