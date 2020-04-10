package Core.FunctionalProgramming.Task

import scala.io.StdIn

object FunExercise {

  def main(args: Array[String]): Unit = {
    println("请输入数字（0-9）之间:")
    val n = StdIn.readInt()
    print99(n)
  }

  // 编写一个函数，输出九九乘法表
  def print99(n: Int): Unit = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, i * j)
      }
      println()
    }
  }

}
