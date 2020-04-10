package DataStructure.Search

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

object BinarySearch {

  def main(args: Array[String]): Unit = {
    var arr = Array(1, 8, 10, 89, 1000, 1000, 1234)
    val index = binarySearch2(arr, 0, arr.length - 1, 1000)
    if (index.length != 0) {
      println("找到，下标为:" + index)
    } else {
      println("没有找到")
    }
  }

  // 如果存在值，就返回对应的下标，否则返回-1（查找单个值）
  def binarySearch1(arr: Array[Int], l: Int, r: Int, findVal: Int): Int = {
    if (l > r) { // 找不到
      -1
    }
    val midIndex = (l + r) / 2
    val midVal = arr(midIndex)
    if (midVal > findVal) { // 向左进行递归查找
      binarySearch1(arr, l, midIndex - 1, findVal)
    } else if (midVal < findVal) { // 向右进行递归查找
      binarySearch1(arr, midIndex + 1, r, findVal)
    } else { // 找到
      midIndex
    }
  }

  // 查找多个相同值
  def binarySearch2(arr: Array[Int], l: Int, r: Int, findVal: Int): ArrayBuffer[Int] = {
    if (l > r) { // 找不到
      ArrayBuffer()
    }
    val midIndex = (l + r) / 2
    val midVal = arr(midIndex)
    if (midVal > findVal) { // 向左进行递归查找
      binarySearch2(arr, l, midIndex - 1, findVal)
    } else if (midVal < findVal) { // 向右进行递归查找
      binarySearch2(arr, midIndex + 1, r, findVal)
    } else { // 找到
      // 定义一个可变数组
      val resArr = ArrayBuffer[Int]()
      // 向左边扫描
      var temp = midIndex - 1
      breakable {
        while (true) {
          if (temp < 0 || arr(temp) != findVal) {
            break()
          }
          if (arr(temp) == findVal) {
            resArr.append(temp)
          }
          temp -= 1
        }
      }
      // 将中间这个索引加入
      resArr.append(midIndex)
      // 向右边扫描
      temp = midIndex + 1
      breakable {
        while (true) {
          if (temp > arr.length - 1 || arr(temp) != findVal) {
            break()
          }
          if (arr(temp) == findVal) {
            resArr.append(temp)
          }
          temp += 1
        }
      }
      resArr
    }
  }
}
