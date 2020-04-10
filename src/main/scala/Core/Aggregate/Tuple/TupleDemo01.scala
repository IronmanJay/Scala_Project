package Core.Aggregate.Tuple

object TupleDemo01 {

  def main(args: Array[String]): Unit = {
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)
    println(tuple1._1)
    println(tuple1.productElement(0))
    for (item <- tuple1.productIterator) {
      println("item:" + item)
    }
  }

}
