package DataStructure.Sort

import util.control.Breaks._

object QuickSort {

  def main(args: Array[String]): Unit = {
    var arr = Array(101, 34, 119, 1)
    quickSort(0, arr.length - 1, arr)
    println("排序后代码:")
    println(arr.mkString(" "))
  }

  /**
   * 快速排序
   *
   * @param left  指定从数组的左边的下标 0
   * @param right 指定从数组的右边的下边length - 1
   * @param arr   进行排序的数组
   */
  def quickSort(left: Int, right: Int, arr: Array[Int]): Unit = {
    var l = left // 左下标
    var r = right // 右下标
    var pivot = arr((left + right) / 2) // 以中间的值为基准进行分割
    var temp = 0
    breakable {
      while (l < r) { // 将比pivot小的数放到左边，比pivot大的数放到右边
        while (arr(l) < pivot) { // 从左边找一个比pivot大的值对应的下标
          l += 1
        }
        while (arr(r) > pivot) { // 从右边找一个比pivot小的值对应的下标
          r -= 1
        }
        if (l >= r) { // 说明本次交换结束
          break()
        }
        var temp = arr(l)
        arr(l) = arr(r)
        arr(r) = temp
        // 如果发现arr(l) == pivot，就可以不进行比较，把r -= 1，提高效率
        if (arr(l) == pivot) {
          r -= 1
        }
        if (arr(r) == pivot) {
          l += 1
        }
      }
    }
    if (l == r) {
      l += 1
      r -= 1
    }
    if (left < r) { // 向左递归
      quickSort(left, r, arr)
    }
    if (right > l) { // 向右递归
      quickSort(l, right, arr)
    }
  }

}
