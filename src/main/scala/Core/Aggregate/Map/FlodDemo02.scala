package Core.Aggregate.Map

object FlodDemo02 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 9, 2, 8)
    val i1 = (1 /: list) (minus)
    println(i1)
    val i2 = (list :\ 1) (minus)
    println(i2)
  }

  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

}
