package Core.Aggregate.FixedLengthArray

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    var arr02 = Array(1, 3, "xxx")
    for (i <- arr02) {
      println(i)
    }
    println("-----------")
    for (index <- 0 to arr02.length - 1) {
      println(arr02(index))
    }
  }
}
