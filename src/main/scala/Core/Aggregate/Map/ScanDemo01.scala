package Core.Aggregate.Map

object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    val i8 = (1 to 5).scanLeft(5)(minus)
    println(i8)
  }
}
