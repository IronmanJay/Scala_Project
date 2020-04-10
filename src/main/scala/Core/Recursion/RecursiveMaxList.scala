package Core.Recursion

object RecursiveMaxList {

  def main(args: Array[String]): Unit = {
    val res = max(List(1, 2, 3, 4))
    println(res)
  }

  def max(xs: List[Int]): Int = {
    if (xs.isEmpty) {
      throw new java.util.NoSuchElementException
    }
    if (xs.size == 1) {
      xs.head
    }
    else if (xs.head > max(xs.tail)) {
      xs.head
    } else {
      max(xs.tail)
    }
  }

}
