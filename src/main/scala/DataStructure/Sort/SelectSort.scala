package DataStructure.Sort

object SelectSort {

  def main(args: Array[String]): Unit = {
    var arr = Array(101, 34, 119, 1)
    selectSort(arr)
  }

  def selectSort(arr: Array[Int]): Unit = {
    for (i <- 0 until arr.length - 1) {
      var min = arr(i)
      var minIndex = i
      for (j <- (i + 1) until arr.length) {
        if (min > arr(j)) {
          min = arr(j)
          minIndex = j
        }
      }
      // 判断是否需要交换
      if (minIndex != i) {
        arr(minIndex) = arr(i)
        arr(i) = min
      }
      println(s"第${i + 1}轮结束")
      println(arr.mkString(" "))
    }
  }

}
