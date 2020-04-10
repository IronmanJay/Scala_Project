package DataStructure.BinaryTree

object BinaryTreeDemo {

  def main(args: Array[String]): Unit = {
    val root = new HeroNode(1, "宋江")
    val hero2 = new HeroNode(2, "吴用")
    val hero3 = new HeroNode(3, "卢俊义")
    val hero4 = new HeroNode(4, "林冲")
    val hero5 = new HeroNode(5, "关胜")

    root.left = hero2
    root.right = hero3
    hero3.left = hero5
    hero3.right = hero4

    val binaryTree = new BinaryTree
    binaryTree.root = root

    // 测试遍历
    println("前序遍历结果:")
    binaryTree.preOrder()
    println("中序遍历结果:")
    binaryTree.infixOrder()
    println("后序遍历结果:")
    binaryTree.postOrder()

    // 测试查找
    println("前序查找结果:")
    val resNode1 = binaryTree.preOrderSearch(5)
    if (resNode1 != null) {
      printf("找到，编号=%d 名字=%s", resNode1.no, resNode1.name)
    } else {
      println("没有找到")
    }
    println()
    println("中序查找结果:")
    val resNode2 = binaryTree.infixOrderSearch(5)
    if (resNode2 != null) {
      printf("找到，编号=%d 名字=%s", resNode2.no, resNode2.name)
    } else {
      println("没有找到")
    }
    println()
    println("后序查找结果:")
    val resNode3 = binaryTree.postOrderSearch(5)
    if (resNode3 != null) {
      printf("找到，编号=%d 名字=%s", resNode3.no, resNode3.name)
    } else {
      println("没有找到")
    }

    // 测试删除
    println()
    binaryTree.delNode(3)
    println("前序遍历结果:")
    binaryTree.preOrder()
  }

}

// 定义节点
class HeroNode(hNo: Int, hName: String) {
  val no = hNo
  var name = hName
  var left: HeroNode = null
  var right: HeroNode = null

  // 删除节点
  def delNode(no: Int): Unit = {
    // 比较当前结点的左子结点是否为要删除的结点
    if (this.left != null && this.left.no == no) {
      this.left = null
      return
    }
    // 比较当前结点的右子结点是否为要删除的结点
    if (this.right != null && this.right.no == no) {
      this.right = null
      return
    }
    // 向左递归删除
    if (this.left != null) {
      this.left.delNode(no)
    }
    // 向右递归删除
    if (this.right != null) {
      this.right.delNode(no)
    }
  }

  // 前序查找
  def preOrderSearch(no: Int): HeroNode = {
    if (no == this.no) { // 找到
      return this
    }
    var resNode: HeroNode = null
    // 向左递归查找
    if (this.left != null) {
      resNode = this.left.preOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    // 向右边递归查找
    if (this.right != null) {
      resNode = this.right.preOrderSearch(no)
    }
    return resNode
  }

  // 前序遍历
  def preOrder(): Unit = {
    // 先输出当前结点的值
    printf("结点信息 no=%d name=%s\n", no, name)
    // 向左递归输出左子树
    if (this.left != null) {
      this.left.preOrder()
    }
    // 向右边递归输出右子树
    if (this.right != null) {
      this.right.preOrder()
    }
  }

  // 中序查找
  def infixOrderSearch(no: Int): HeroNode = {
    var resNode: HeroNode = null
    // 向左递归查找
    if (this.left != null) {
      resNode = this.left.infixOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (no == this.no) { // 找到
      return this
    }
    // 向右边递归查找
    if (this.right != null) {
      resNode = this.right.infixOrderSearch(no)
    }
    return resNode
  }

  // 中序遍历
  def infixOrder(): Unit = {
    // 向左递归输出左子树
    if (this.left != null) {
      this.left.infixOrder()
    }
    // 再输出当前结点的值
    printf("结点信息 no=%d name=%s\n", no, name)
    // 向右边递归输出右子树
    if (this.right != null) {
      this.right.infixOrder()
    }
  }

  // 后序查找
  def postOrderSearch(no: Int): HeroNode = {
    var resNode: HeroNode = null
    // 向左递归查找
    if (this.left != null) {
      resNode = this.left.postOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    // 向右边递归查找
    if (this.right != null) {
      resNode = this.right.postOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (no == this.no) { // 找到
      return this
    }
    resNode
  }

  // 后序遍历
  def postOrder(): Unit = {
    // 向左递归输出左子树
    if (this.left != null) {
      this.left.postOrder()
    }
    // 向右边递归输出右子树
    if (this.right != null) {
      this.right.postOrder()
    }
    // 再输出当前结点的值
    printf("结点信息 no=%d name=%s\n", no, name)
  }

}

// 二叉树
class BinaryTree {
  var root: HeroNode = null // 根节点

  // 删除结点
  def delNode(no: Int): Unit = {
    if (root != null) {
      // 先处理root是不是要删除的
      if (root.no == no) {
        root = null
      } else {
        root.delNode(no)
      }
    }
  }

  // 前序查找
  def preOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.preOrderSearch(no)
    } else {
      null
    }
  }

  // 前序遍历
  def preOrder(): Unit = {
    if (root != null) {
      root.preOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  // 中序查找
  def infixOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.infixOrderSearch(no)
    } else {
      null
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

  // 后序查找
  def postOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.postOrderSearch(no)
    } else {
      null
    }
  }

  // 后序遍历
  def postOrder(): Unit = {
    if (root != null) {
      root.postOrder()
    } else {
      println("当前二叉树为空")
    }
  }

}


