package Core.Aggregate.Map

import scala.collection.mutable

object Exercise04 {

  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println(map2)

    // 1. 先创建一个可变map,作为左折叠的第一个参数
    val map3 = mutable.Map[Char, Int]()
    sentence.foldLeft(map3)(charCount2)
    println(map3)

  }

  // 不可变map
  def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char, 0) + 1))
  }

  // 使用可变的map,效率更高
  def charCount2(map: mutable.Map[Char, Int], char: Char): mutable.Map[Char, Int] = {
    map += (char -> (map.getOrElse(char, 0) + 1))
  }

}
