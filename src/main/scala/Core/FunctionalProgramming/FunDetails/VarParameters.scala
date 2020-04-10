package Core.FunctionalProgramming.FunDetails

object VarParameters {

  def main(args: Array[String]): Unit = {
    // 编写一个函数sum，可以求出1到多个int的和
    // 可变形参要放在最后
    println(sum(10, 20, 30, 40))
  }

  def sum(n1: Int, args: Int*): Int = {
    println("args.length=" + args.length)
    // 遍历
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }

}
