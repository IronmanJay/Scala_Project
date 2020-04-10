package Core.FunctionalProgramming.PartialFun

object PartialFunDemo01 {

  def main(args: Array[String]): Unit = {
    // 思路一：filter+map
    val list = List(1, 2, 3, 4, "abc")
    // 先过滤，再map
    println(list.filter(f1).map(f3).map(f2))

    // 思路二：模式匹配
    val list2 = list.map(addOne2)
    println(list2)

  }

  def addOne2(i: Any): Any = {
    i match {
      case x: Int => x + 1
      case _ =>
    }
  }

  def f1(n: Any): Boolean = {
    n.isInstanceOf[Int]
  }

  // 将Any转成Int
  def f3(n: Any): Int = {
    n.asInstanceOf[Int]
  }

  def f2(n: Int): Int = {
    n + 1
  }

}
