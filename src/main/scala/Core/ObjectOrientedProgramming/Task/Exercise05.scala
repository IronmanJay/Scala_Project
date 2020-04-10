package Core.ObjectOrientedProgramming.Task

object Exercise05 {

  def main(args: Array[String]): Unit = {
    val str = "Hello"
    println(product(str))
  }

  def product(s: String): Long = {
    if (s.length == 1) {
      return s.charAt(0).toLong
    } else {
      s.take(1).charAt(0).toLong * product(s.drop(1))
    }
  }

}
