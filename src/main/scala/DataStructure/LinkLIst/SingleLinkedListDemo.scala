package DataStructure.LinkLIst

import util.control.Breaks._

object SingleLinkedListDemo {

  def main(args: Array[String]): Unit = {

    // 测试单向链表的添加和遍历
    val node1 = new HeroNode(1, "宋江1", "及时雨1")
    val node2 = new HeroNode(3, "宋江3", "及时雨3")
    val node3 = new HeroNode(4, "宋江4", "及时雨4")
    val node4 = new HeroNode(2, "宋江2", "及时雨2")
    // 创建单向链表
    val singleLinkedList = new SingleLinkedList
    singleLinkedList.add(node1)
    singleLinkedList.add(node2)
    singleLinkedList.add(node3)
    singleLinkedList.add(node4)
    singleLinkedList.list()
    val node5 = new HeroNode(3, "吴用", "智多星")
    singleLinkedList.update(node5)
    println("=======================================")
    singleLinkedList.list()
    singleLinkedList.del(3)
    println("=======================================")
    singleLinkedList.list()

  }

}

// 定义单向链表管理Hero
class SingleLinkedList {
  // 先初始化头结点，一般不会动
  val head = new HeroNode(0, "", "")

  // 删除方法
  def del(no: Int): Unit = {
    var temp = head
    var flag = false // 标志变量用于确定是否有要删除的结点
    breakable {
      while (true) {
        if (temp.next == null) {
          break()
        }
        if (temp.next.no == no) { // 找到了
          flag = true
          break()
        }
        temp = temp.next // 后移
      }
    }
    if (flag) { // 可以删除
      temp.next = temp.next.next
    } else {
      println("要删除的no=%d不存在\n", no)
    }

  }

  // 编写添加方法
  // 第一种方法在添加英雄时，直接添加到链表的尾部
  def add(heroNode: HeroNode): Unit = {
    // 因为头结点不能动，所以需要一个临时结点，作为辅助
    var temp = head
    // 找到链表的最后
    breakable {
      while (true) {
        if (temp.next == null) { // 说明temp已经是链表最后
          break()
        }
        // 如果没有到最后
        temp = temp.next
      }
    }
    // 当退出while循环后，temp就是链表的最后
    temp.next = heroNode
  }

  // 第二种方式添加英雄时，根据排名将英雄插入到指定位置
  // 如果有这个人（排名），则添加失败
  def add2(heroNode: HeroNode): Unit = {
    // 因为头结点不能动，所以需要一个临时结点，作为辅助
    // 注意：在找这个添加位置时，是将这个节点加入到temp的后面
    // 因此，在比较时，是将当前的heroNode和temp.next比较
    var temp = head
    var flag = false // 用于判断该英雄的编号已经存在
    breakable {
      while (true) {
        if (temp.next == null) { // 说明temp已经是链表最后
          break()
        }
        if (temp.next.no > heroNode.no) { // 位置找到
          break()
        } else if (temp.next.no == heroNode) { // 说明节点已存在
          flag = true
          break()
        }
        temp = temp.next
      }
    }
    if (flag) { // 不可以加
      printf("待插入的英雄编号%d已经存在", heroNode.no)
    } else {
      // 加入，注意顺序
      heroNode.next = temp.next
      temp.next = heroNode
    }
  }

  // 修改节点的值
  def update(newHeroNode: HeroNode): Unit = {
    if (head.next == null) {
      println("链表为空")
      return
    }
    // 先找到这个节点
    var temp = head.next
    var flag = false
    breakable {
      while (true) {
        if (temp == null) {
          break()
        }
        if (temp.no == newHeroNode.no) { // 找到了
          flag = true
          break()
        }
        temp = temp.next
      }
    }
    // 判断是否找到
    if (flag == true) {
      temp.name = newHeroNode.name
      temp.nickname = newHeroNode.nickname
    } else {
      println("没有找到编号为%d的结点，不能修改\n", newHeroNode.no)
    }
  }

  // 遍历单向链表
  def list(): Unit = {
    // 判断当前链表是否为空
    if (head.next == null) {
      println("当前链表为空")
      return
    }
    // 因为头结点不能动，所以需要一个临时结点，作为辅助
    // 因为头结点的数据我们不关心，因此这里temp = head.next
    var temp = head.next
    breakable {
      while (true) {
        if (temp == null) {
          break()
        }
        printf("结点信息 no=%d name=%s nickname=%s\n", temp.no, temp.name, temp.nickname)
        // 判断是否到最后
        temp = temp.next
      }
    }
  }

}

// 先创建HeroNode
class HeroNode(hNo: Int, hName: String, hNickname: String) {
  var no: Int = hNo
  var name: String = hName
  var nickname: String = hNickname
  var next: HeroNode = null // 默认为空
}
