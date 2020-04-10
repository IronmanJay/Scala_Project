package DataStructure.Queue.UnidirectionalQueue

import scala.io.StdIn

object QueueDemo01 {

  def main(args: Array[String]): Unit = {
    // 初始化队列
    val queue = new ArrayQueue(3)
    var key = ""
    while (true) {
      println("show:表示显示队列")
      println("exit:退出程序")
      println("add:添加数据")
      println("get:取出数据")
      println("head:查看队列头的数据")
      key = StdIn.readLine()
      key match {
        case "show" => queue.showQueue()
        case "exit" => System.exit(0)
        case "add" => {
          println("请输入一个数：")
          val value = StdIn.readInt()
          queue.addQueue(value)
        }
        case "get" => {
          val res = queue.getQueue()
          if (res.isInstanceOf[Exception]) {
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println("取出数据是:" + res)
          }
        }
        case "head" => {
          val res = queue.headQueue()
          if (res.isInstanceOf[Exception]) {
            // 显示错误信息
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println("队列头元素值=" + res)
          }
        }
      }
    }
  }

}

// 使用数组模拟队列
class ArrayQueue(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize) // 该数组存放数据，模拟队列
  var front = -1 // 指向队列头部
  var rear = -1 // 指向队列尾部

  // 判断队列是否满
  def isFull(): Boolean = {
    rear == maxSize - 1
  }

  // 判断队列是否空
  def isEmpty(): Boolean = {
    front == rear
  }

  // 添加数据
  def addQueue(n: Int): Unit = {
    // 判断是否满
    if (isFull()) {
      println("队列满，无法加入")
      return
    }
    rear += 1
    arr(rear) = n
  }

  // 取出数据
  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    front += 1
    arr(front)
  }

  // 显示队列的所有数据
  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列空，没有数据")
      return
    }
    for (i <- front + 1 to rear) {
      printf("arr[%d]=%d\n", i, arr(i))
    }
  }

  // 查看队列的头元素，但是不是改变队列
  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    arr(front + 1)
  }

}
