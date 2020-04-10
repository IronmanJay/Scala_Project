package Core.Aggregate.ArrayBuffer

import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {

  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()
    println(arrList)
  }

}
