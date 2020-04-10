package Core.Aggregate.FixedLengthArray

object ArrayDemo01 {

  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Int](4)
    println(arr01.length)

    println("arr01(0)=" + arr01(0))
    for (i <- arr01) {
      println(i)
    }
    println("---------------------")
    arr01(3) = 10
    for (i <- arr01) {
      println(i)
    }
  }

}
