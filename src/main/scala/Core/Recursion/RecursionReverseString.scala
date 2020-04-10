package Core.Recursion

object RecursionReverseString {

  def main(args: Array[String]): Unit = {
    val str: String = "Hello"
    println(reverse(str))
  }

  def reverse(xs: String): String = {
    if (xs.length == 1) xs else reverse(xs.tail) + xs.head
  }

}
