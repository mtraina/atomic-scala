package com.atomicscala.classes

/**
 * Created by Matteo on 07/12/14.
 */
class Coffee(val shots :Int = 2,
              val decaf :Boolean = false,
              val milk :Boolean = false,
              val toGo :Boolean = false,
              val syrup :String = "") {

  var result = ""
  println(shots, decaf, milk, toGo, syrup)

  def getCup() = {
    if(toGo) result += "ToGoCup "
    else result += "HereCup "
  }

  def pourShots() = {
    for(s <- 0 until shots)
      if(decaf) result += "decaf shot "
      else result += "shot "
  }

  def addMilk() = {
    if(milk) result += "milk "
  }

  def addSyrup() = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()

}
