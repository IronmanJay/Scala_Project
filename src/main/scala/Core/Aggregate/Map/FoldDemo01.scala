package Core.Aggregate.Map

object FoldDemo01 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.foldLeft(5)(minus)) // 函数的柯里化
    println(list.foldRight(5)(minus))
  }

  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

}
