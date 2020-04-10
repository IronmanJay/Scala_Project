package Core.Aggregate.Map

import scala.collection.mutable.ArrayBuffer

object Exercise03 {

  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arrayBuffer = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArray)
    println(arrayBuffer)
  }

  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    //将c放入到arr中
    arr.append(c)
    arr
  }

}
