package scala.atomicscala

/**
 * Created by Matteo on 04/12/14.
 */
object Animals {

  def main (args: Array[String]) {
    val cat = new Cat
    val m1 = cat.meow
    print("test")
    assert("mew!" == m1, "expected mew! got " + m1)

    val hamster = new Hamster
    val h1 = hamster.exercise
    assert("squeak! running on wheel" == h1)
  }

}

class Dog {
  def bark = "yip!"
}

class Cat {
  def meow = "mew!"
}

class Hamster {
  def speak = "squeak!"

  def exercise = speak + " running on wheel"
}
