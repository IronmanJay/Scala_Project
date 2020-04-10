package Core.Aggregate.MultiplyArray

object MultiplyArrayDemo01 {

  def main(args: Array[String]): Unit = {
    // 创建
    var arr = Array.ofDim[Int](3, 4)
    // 遍历
    for (item <- arr) {
      for (item2 <- item) {
        print("\t" + item2)
      }
      println()
    }
    // 指定取出元素
    println(arr(1)(1))
    // 修改值
    arr(1)(1) = 100
    for (item <- arr) {
      for (item2 <- item) {
        print("\t" + item2)
      }
      println()
    }
  }

}
