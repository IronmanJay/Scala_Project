package Core.Aggregate.Map

object Exercise02 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    println(list.reduceLeft(minus))
    println(list.reduceRight(minus))
    println(list.reduce(minus))

    println(list.reduceLeft(min))
  }

  // 求出最小值
  def min(n1: Int, n2: Int): Int = {
    if (n1 > n2) {
      n2
    } else {
      n1
    }
  }

}
