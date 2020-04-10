package Core.Aggregate.ArrayBuffer

import scala.collection.mutable.ArrayBuffer

object JavaList2ArrayBuffer {

  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()
    println(arrList)

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("java")
    println(scalaArr)
  }

}
