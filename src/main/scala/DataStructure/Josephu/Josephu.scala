package DataStructure.Josephu

import util.control.Breaks._

object Josephu {

  def main(args: Array[String]): Unit = {
    // 创建BoyGame
    val boyGame = new BoyGame
    boyGame.addBoy(7000)
    boyGame.showBoy()
    boyGame.countBoy(41, 30, 7000)
  }

}

// 定义Boy类
class Boy(bNo: Int) {
  val no: Int = bNo
  var next: Boy = null
}

// 编写核心类
class BoyGame {
  // 定义一个初始的头结点，first内容会修改
  var first: Boy = new Boy(-1)

  // 添加小孩(形成单向环形的链表)
  // nums表示共有几个小孩
  def addBoy(nums: Int): Unit = {
    if (nums < 1) {
      println("nums的值不正确")
      return
    }
    // 在形成环形链表时，需要一个辅助指针
    var curBoy: Boy = null
    for (no <- 1 to nums) {
      // 根据编号创建小孩对象
      val boy = new Boy(no)
      // 如果是第一个小孩
      if (no == 1) {
        first = boy
        first.next = first // 形成了一个环形的链表
        curBoy = first // first已经确定，不能动
      } else {
        curBoy.next = boy
        boy.next = first
        curBoy = boy
      }
    }
  }

  /**
   * 编写方法countBoy，完成游戏
   *
   * @param startNo  从第几个人开始数
   * @param countNum 数几下
   * @param nums     一共多少人
   */
  def countBoy(startNo: Int, countNum: Int, nums: Int): Unit = {
    // 对参数进行判断
    if (first.next == null || startNo < 1 || startNo > nums) {
      println("参数有误，重新输入！")
      return
    }
    // 完成游戏的思路
    // 设计一个辅助指针
    var helper = first
    breakable {
      while (true) {
        if (helper.next == first) {
          break()
        }
        helper = helper.next
      }
    }
    // 将first指针移动到startNo
    for (i <- 0 until startNo - 1) {
      first = first.next
      helper = helper.next
    }
    // 开始数countNum个数
    breakable {
      while (true) {
        if (helper == first) { // 只有一个人了
          break()
        }
        for (i <- 0 until countNum - 1) {
          first = first.next
          helper = helper.next
        }
        // 输出出圈的人
        printf("小孩%d出圈\n", first.no)
        // 将first指向的结点删除
        first = first.next
        helper.next = first
      }
    }
    // 当while循环结束后，只有一个人了
    printf("最后留在圈的人是小孩%d\n", first.no)
  }

  // 遍历单向的环形链表
  def showBoy(): Unit = {
    if (first.next == null) {
      println("没有任何小孩")
      return
    }
    // 因为first不能动，还是借助辅助指针完成遍历
    var curBoy = first
    breakable {
      while (true) {
        printf("小孩编号:%d\n", curBoy.no)
        if (curBoy.next == first) {
          break()
        }
        curBoy = curBoy.next // curBoy继续后移
      }
    }
  }

}
