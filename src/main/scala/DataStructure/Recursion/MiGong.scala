package DataStructure.Recursion

object MiGong {

  def main(args: Array[String]): Unit = {
    // 地图
    val map = Array.ofDim[Int](8, 7)
    // 上下面全部置1
    for (i <- 0 until 7) {
      map(0)(i) = 1
      map(7)(i) = 1
    }
    // 左右面全部置1
    for (i <- 0 until 8) {
      map(i)(0) = 1
      map(i)(6) = 1
    }
    // 设置挡板
    map(3)(1) = 1
    map(3)(2) = 1
//    map(1)(2) = 1
//    map(2)(2) = 1
    // 打印地图
    for (i <- 0 until 8) {
      for (j <- 0 until 7) {
        print(map(i)(j) + " ")
      }
      println()
    }
    // 测试递归回溯方法
    setWay(map, 1, 1)
    println("=============")
    // 打印新的地图
    for (i <- 0 until 8) {
      for (j <- 0 until 7) {
        print(map(i)(j) + " ")
      }
      println()
    }
  }

  /**
   * 使用递归回溯来找路
   * @param map 地图
   * @param i   从地图的哪个点开始出发
   * @param j   （1，1）
   * @return
   */
  def setWay(map: Array[Array[Int]], i: Int, j: Int): Boolean = {
    if (map(6)(5) == 2) { // 表示路已经找到
      true
    } else {
      if (map(i)(j) == 0) { // 表示可以走，还没有走
        // 这里递归和回溯
        map(i)(j) = 2 // 假设该点可以走，但是不一定可以
        if (setWay(map, i + 1, j)) { // 向下找
          true
        } else if (setWay(map, i, j + 1)) { // 向右找
          true
        } else if (setWay(map, i - 1, j)) { // 向上找
          true
        } else if (setWay(map, i, j - 1)) { // 向左找
          true
        } else {
          // 如果进来，说明上面那个点不能走
          map(i)(j) = 3
          false
        }
      } else { // 如果map(i)(j) ！= 0，则值只能是1
        false
      }
    }
  }

}


