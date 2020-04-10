package Core.Other.Generic

object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val value = new IntMessage[Int](10)
    println(value)
  }
}

abstract class Message[T](s: T) {
  def get = s
}

class IntMessage[Int](v: Int) extends Message(v)