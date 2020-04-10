package Core.Aggregate.View

object ViewDemo01 {

  def main(args: Array[String]): Unit = {
    def multiple(num: Int): Int = {
      num
    }

    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }

    // 没有使用view
    val viewSquares1 = (1 to 100)
      .map(multiple)
      .filter(eq)
    println(viewSquares1)
    // 使用view
    val viewSquares2 = (1 to 100)
      .view
      .map(multiple)
      .filter(eq)
    println(viewSquares2)
    // 遍历
    for (item <- viewSquares2) {
      println(item)
    }
  }

}
