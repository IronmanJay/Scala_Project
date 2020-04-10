package DataStructure.BinaryTree

object BinarySortTree {

  def main(args: Array[String]): Unit = {
    // 测试
    val arr = Array(7, 3, 10, 12, 5, 1, 9, 2)
    // 创建二叉排序树
    val binarySortTree = new BinarySortTree
    for (item <- arr) {
      binarySortTree.add(new Node(item))
    }

    // 遍历二叉排序树
    binarySortTree.infixOrder()

    // 删除叶子节点
    //    binarySortTree.delNode(5)
    println("删除后")
    // 遍历二叉排序树
    binarySortTree.infixOrder()

    // 删除只有一个子结点的情况
    println("删除后")
    //    binarySortTree.delNode(1)
    // 遍历二叉排序树
    binarySortTree.infixOrder()

    // 删除有两个子结点的情况
    println("删除后")
    binarySortTree.delNode(7)
    // 遍历二叉排序树
    binarySortTree.infixOrder()

  }

}

// 定义结点
class Node(var value: Int) {

  var left: Node = null
  var right: Node = null

  // 找某个节点的父节点
  def searchParent(value: Int): Node = {
    // 先判断当前结点的左或者右是否是这个值
    if (this.left != null && this.left.value == value || this.right != null && this.right.value == value) {
      this
    } else {
      if (this.left != null && value < this.value) { // 向左递归查找
        this.left.searchParent(value)
      } else if (this.right != null && value > this.value) { // 向右递归查找
        this.right.searchParent(value)
      } else {
        null
      }
    }
  }

  // 查找某个节点，根据值
  def search(value: Int): Node = {
    // 先判断当前结点是否是要删除的结点
    if (value == this.value) {
      this
    } else if (value < this.value) { // 递归向左查找
      if (this.left == null) {
        null
      } else {
        this.left.search(value)
      }
    } else {
      if (right == null) {
        null
      } else { // 递归向右查找
        this.right.search(value)
      }
    }
  }

  // 添加
  def add(node: Node): Unit = {
    if (node == null) { // 如果节点为空就返回
      return
    }
    // 如果要加入的结点的值小于当前结点的值，则可以处理
    if (node.value < this.value) {
      if (this.left == null) { // 说明左子树没有子树，可以加入
        this.left = node
      } else {
        // 递归的进行添加
        this.left.add(node)
      }
    } else { // 如果要加入的结点的值大于等于当前结点的值
      if (this.right == null) {
        this.right = node
      } else {
        // 递归的进行添加
        this.right.add(node)
      }
    }
  }

  // 中序遍历
  def infixOrder(): Unit = {
    // 向左递归输出左子树
    if (this.left != null) {
      this.left.infixOrder()
    }
    // 再输出当前结点的值
    printf("结点信息 value=%d\n", value)
    // 向右边递归输出右子树
    if (this.right != null) {
      this.right.infixOrder()
    }
  }

}

// 定义二叉排序树
class BinarySortTree {

  var root: Node = null

  // 删除某个右子树的最小值的结点，并返回最小值
  def delRightTreeMin(node: Node): Int = {
    var target = node
    // 使用while循环找到右子树的最小值
    while (target.left != null) {
      target = target.left
    }
    val minValue = target.value
    delNode(minValue)
    minValue
  }

  def add(node: Node): Unit = {
    if (root == null) { // 空树，直接挂
      root = node
    } else {
      root.add(node)
    }
  }

  // 中序遍历
  def infixOrder(): Unit = {
    if (root != null) {
      root.infixOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  // 查找结点
  def search(value: Int): Node = {
    if (root != null) {
      root.search(value)
    } else {
      null
    }
  }

  // 查找父节点
  def searchParent(value: Int): Node = {
    if (root != null) {
      root.searchParent(value)
    } else {
      null
    }
  }

  // 删除节点（叶子节点）
  def delNode(value: Int): Unit = {
    if (root == null) {
      return
    }
    // 先看看有没有要删除的结点
    var targetNode = search(value)
    if (targetNode == null) {
      return
    }
    // 查找targetNode的父节点
    var parentNode = searchParent(value)
    if (targetNode.left == null && targetNode.right == null) { // 叶子节点
      // 判断要删除的结点是parentNode的左子结点还是右子节点
      if (parentNode.left != null && parentNode.left.value == value) { // 说明待删除的结点是左节点
        parentNode.left = null
      } else {
        parentNode.right = null
      }
    } else if (targetNode.left != null && targetNode.right != null) { // targetNode有两个子结点
      // 找到最小值，并删除
      val value = delRightTreeMin(targetNode.right)
      targetNode.value = value
    } else { // targetNode只有一个子结点
      // 判断targetNode是parentNode的左子结点还是右子结点
      if (targetNode.left != null) {
        if (parentNode.left.value == value) {
          parentNode.left = targetNode.left
        } else {
          parentNode.right = targetNode.left
        }
      } else {
        if (parentNode.left.value == value) {
          parentNode.left = targetNode.right
        } else {
          parentNode.right = targetNode.right
        }
      }
    }
  }

}
