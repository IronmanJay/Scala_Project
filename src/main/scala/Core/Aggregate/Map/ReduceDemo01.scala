package Core.Aggregate.Map

object ReduceDemo01 {

  def main(args: Array[String]): Unit = {
    // 使用化简的方式来计算list集合的和
    val list = List(1, 20, 30, 4, 5)
    val res = list.reduceLeft(sum)
    println(res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("被调用")
    n1 + n2
  }

}
