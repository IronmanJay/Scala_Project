package Core.Recursion

object RecursionFactoria {

  def main(args: Array[String]): Unit = {
    println(factoria(10))
  }

  def factoria(n: Int): Int = {
    if (n == 0) {
      1
    } else {
      n * factoria(n - 1)
    }
  }

}
