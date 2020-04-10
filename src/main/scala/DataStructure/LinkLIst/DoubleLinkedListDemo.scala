package DataStructure.LinkLIst

import scala.util.control.Breaks.{break, breakable}

object DoubleLinkedListDemo {

  def main(args: Array[String]): Unit = {
    val node1 = new HeroNode2(1, "宋江1", "及时雨1")
    val node2 = new HeroNode2(3, "宋江3", "及时雨3")
    val node3 = new HeroNode2(4, "宋江4", "及时雨4")
    val node4 = new HeroNode2(2, "宋江2", "及时雨2")
    // 创建单向链表
    val doubleLinkedList = new DoubleLinkedList
    doubleLinkedList.add(node1)
    doubleLinkedList.add(node2)
    doubleLinkedList.add(node3)
    doubleLinkedList.add(node4)
    doubleLinkedList.list()
    val node5 = new HeroNode2(3, "吴用", "智多星")
    doubleLinkedList.update(node5)
    println("=======================================")
    doubleLinkedList.list()
    doubleLinkedList.del(2)
    println("=======================================")
    doubleLinkedList.list()

  }

}

class DoubleLinkedList {
  // 先初始化头结点，一般不会动
  val head = new HeroNode2(0, "", "")

  // 删除方法
  def del(no: Int): Unit = {
    // 判断当前链表是否为空
    if (head.next == null) {
      println("链表空")
      return
    }
    var temp = head.next
    var flag = false // 标志变量用于确定是否有要删除的结点
    breakable {
      while (true) {
        if (temp.next == null) {
          break()
        }
        if (temp.no == no) { // 找到了
          flag = true
          break()
        }
        temp = temp.next // 后移
      }
    }
    if (flag) { // 可以删除
      temp.pre.next = temp.next
      if (temp.next != null) {
        temp.next.pre = temp.pre
      }
    } else {
      printf("要删除的no=%d不存在\n", no)
    }
  }

  // 修改节点的值
  def update(newHeroNode: HeroNode2): Unit = {
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

  // 添加方法
  // 第一种方法在添加英雄时，直接添加到链表的尾部
  def add(heroNode: HeroNode2): Unit = {
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
    heroNode.pre = temp
  }

  // 遍历方法
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
class HeroNode2(hNo: Int, hName: String, hNickname: String) {
  var no: Int = hNo
  var name: String = hName
  var nickname: String = hNickname
  var pre: HeroNode2 = null
  var next: HeroNode2 = null // 默认为空
}
