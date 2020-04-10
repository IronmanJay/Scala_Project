package Core.Aggregate.ArrayBuffer

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val arr01 = ArrayBuffer[Any](3, 2, 5)
    for (i <- arr01) {
      print(i + ",")
    }
    println(arr01.length)
    arr01.append(90.0, 13)
    println("----------------")
    for (i <- arr01) {
      print(i + ",")
    }
    arr01.remove(0)
    println("----------------")
    for (i <- arr01) {
      print(i + ",")
    }
  }
}
