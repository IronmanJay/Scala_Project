package Core.ObjectOrientedProgramming.Task

object Exercise04 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    "Hello".foreach(res *= _.toLong)
    println("res=" + res)
  }
}
