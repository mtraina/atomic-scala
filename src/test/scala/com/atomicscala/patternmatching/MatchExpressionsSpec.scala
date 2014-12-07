package com.atomicscala.patternmatching

import org.scalatest.{Matchers, FlatSpec}
import com.atomicscala.patternmatching.MatchExpressions._

/**
 * Created by Matteo on 07/12/14.
 */
class MatchExpressionsSpec extends FlatSpec with Matchers {

  "A match expression" should "match the right color" in {
    matchColor("white") should be (UNKNOWN_COLOR_PREFIX + "white")
    matchColor("blue") should be ("BLUE")
  }

}
