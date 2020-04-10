package DataStructure.BinaryTree

object ArrTreeDemo {

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    val arrayTree = new ArrayTree(arr)
    // 前序遍历数组
    arrayTree.preOrder()
  }

}

class ArrayTree(val arr: Array[Int]) {

  // 对preOrder重载
  def preOrder(): Unit = {
    this.preOrder(0)
  }

  def preOrder(index: Int): Unit = {
    if (arr == null || arr.length == 0) {
      println("数组为空，无法按照二叉树前序遍历")
    }
    print(" " + arr(index))
    // 向左递归遍历
    if ((index * 2 + 1) < arr.length) {
      preOrder(index * 2 + 1)
    }
    // 向右递归遍历
    if ((index * 2 + 2) < arr.length) {
      preOrder(index * 2 + 2)
    }
  }

}
