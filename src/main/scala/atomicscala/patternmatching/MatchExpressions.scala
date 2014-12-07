package scala.atomicscala.patternmatching

/**
 * Created by Matteo on 07/12/14.
 */
object MatchExpressions {
  val UNKNOWN_COLOR_PREFIX = "UNKNOWN COLOR: ";

  def matchColor(color :String):String = {
    color match {
      case "red" => "RED"
      case "blue" => "BLUE"
      case "green" => "GREEN"
      case _ => UNKNOWN_COLOR_PREFIX + color
    }
  }

  matchColor("white") is UNKNOWN_COLOR_PREFIX + "white"
  matchColor("blue") is "BLUE"
}
