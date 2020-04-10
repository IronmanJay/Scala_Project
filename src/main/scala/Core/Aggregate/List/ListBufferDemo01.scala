package Core.Aggregate.List

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {

  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1, 2, 3)
    println("lst0(2)=" + lst0(2))
    for (item0 <- lst0) {
      println("item0=" + item0)
    }

    val lst1 = new ListBuffer[Int]
    lst1 += 4
    lst1.append(5)
    lst0 ++= lst1
    for (item1 <- lst1) {
      println("item1=" + item1)
    }
    val lst2 = lst0 ++ lst1
    println("lst2=" + lst2)
    val lst3 = lst0 :+ 5
    println("lst3=" + lst3)
    println("=====删除=====")
    println("lst1" + lst1)
    lst1.remove(1)
    for (item <- lst1) {
      println("item=" + item)
    }
  }

}
