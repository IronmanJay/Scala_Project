package DataStructure.Sort

object MergeSort {

  def main(args: Array[String]): Unit = {
    var arr = Array(101, 34, 119, 1)
    val temp = new Array[Int](arr.length)
    mergeSort(arr, 0, arr.length - 1, temp)
    println("排序后:")
    println(arr.mkString(" "))
  }

  /**
   * 归并排序
   *
   * @param arr   待排序的数组
   * @param left  最初左边的下标 0
   * @param right 最初的右边的下标 arr.length - 1
   * @param temp  临时数组，一定和待排序数组大小相等，事先开辟好
   */
  def mergeSort(arr: Array[Int], left: Int, right: Int, temp: Array[Int]): Unit = {
    if (left < right) { // 分
      val mid = (left + right) / 2
      mergeSort(arr, left, mid, temp) // 递归将左边的数据做成有序列表
      mergeSort(arr, mid + 1, right, temp) // 递归将右边的数据做成有序列表
      merge(arr, left, mid, right, temp) // 合并
    }
  }

  // 并
  def merge(arr: Array[Int], left: Int, mid: Int, right: Int, temp: Array[Int]) = {
    var i = left // 左边的下标
    var j = mid + 1 // 右边的下标
    var t = 0 // 临时数组的下标
    while (i <= mid && j <= right) {
      if (arr(i) <= arr(j)) { // 如果当前的左边的有序列表的值小于当前的右边的有序列表的值，就将这个小值拷贝到temp中
        temp(t) = arr(i)
        t += 1
        i += 1
      } else {
        temp(t) = arr(j)
        t += 1
        j += 1
      }
    }
    while (i <= mid) { // 如果左边有序列表还有剩余数据，依次拷贝到temp数组
      temp(t) = arr(i)
      t += 1
      i += 1
    }
    while (j <= right) { // 如果右边有序列表还有剩余数据，依次拷贝到temp数组
      temp(t) = arr(j)
      t += 1
      j += 1
    }
    // 下面的代码是将本次的temp中的数据拷贝到arr中
    t = 0
    var tempLeft = left
    while (tempLeft <= right) {
      arr(tempLeft) = temp(t)
      t += 1
      tempLeft += 1
    }
  }

}
