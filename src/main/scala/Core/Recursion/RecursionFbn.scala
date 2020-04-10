package Core.Recursion

object RecursionFbn {

  def main(args: Array[String]): Unit = {
    println(fbn(10))
  }

  def fbn(n: BigInt): BigInt = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }

}
