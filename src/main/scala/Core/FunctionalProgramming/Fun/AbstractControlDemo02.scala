package Core.FunctionalProgramming.Fun

object AbstractControlDemo02 {

  def main(args: Array[String]): Unit = {
    var x = 10
    while (x > 0) {
      x -= 1
      println(x)
    }
    println("=============")
    x = 10
    until(x > 0) {
      x -= 1
      println(x)
    }

  }

  // 使用控制抽象，写出until函数，实现类似的效果
  def until(condition: => Boolean)(block: => Unit): Unit = {
    if (condition) {
      block
      // 递归调用until
      until(condition)(block)
    }
  }

}
