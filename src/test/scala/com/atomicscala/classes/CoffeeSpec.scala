package com.atomicscala.classes

import com.atomicscala.patternmatching.MatchExpressions._
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Matteo on 07/12/14.
 */
class CoffeeSpec extends FlatSpec with Matchers {

  "A coffee" should "contains the right ingredients" in {

    val usual = new Coffee
    usual.result should be ("HereCup shot shot ")

    val mocha = new Coffee(decaf = true, toGo =  true, syrup = "Chocolate")
    mocha.result should be ("ToGoCup decaf shot decaf shot Chocolate")
  }

}
