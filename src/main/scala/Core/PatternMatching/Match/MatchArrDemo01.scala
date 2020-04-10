package Core.PatternMatching.Match

import scala.collection.mutable.ArrayBuffer

object MatchArrDemo01 {

  def main(args: Array[String]): Unit = {
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val res = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(x, _*) => "以0开头的数组"
        case _ => "什么集合都不是"
      }
      println(res)
    }
    println("=================")
    //给你一个数组集合，如果该数组时  Array(10,20) , 请使用默认匹配，返回Array(20,10)
    for (arr2 <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val res = arr2 match {
        case Array(x, y) => ArrayBuffer(y, x)
        case _ => "不处理"
      }
      println(res)
    }

  }

}
