package Core.FunctionalProgramming.PartialFun

object PartialFunDemo03 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 2.1, "abc")

    // 偏函数的简化形式一
    def f2: PartialFunction[Any, Int] = {
      case i: Int => i + 1
      case j: Double => (j * 2).toInt
    }

    val res1 = list.collect(f2)
    println(res1)

    // 偏函数的简化形式二
    val res2 = list.collect { case i: Int => i + 1 }

    println(res2)

  }

}
