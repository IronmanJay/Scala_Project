package DataStructure.Sort

object InsertSort {

  def main(args: Array[String]): Unit = {
    var arr = Array(101, 34, 119, 1)
    insertSort(arr)
  }

  def insertSort(arr: Array[Int]): Unit = {
    for (i <- 1 until arr.length) {
      val insertVal = arr(i)
      var insertIndex = i - 1 // 表示有序表的最后元素的下标
      while (insertIndex >= 0 && insertVal < arr(insertIndex)) { // 还没有找到位置
        arr(insertIndex + 1) = arr(insertIndex)
        insertIndex -= 1
      }
      // 退出while，说明插入的位置找到了
      arr(insertIndex + 1) = insertVal
      println(s"第${i}轮的结果是")
      println(arr.mkString(" "))
    }
  }

}
