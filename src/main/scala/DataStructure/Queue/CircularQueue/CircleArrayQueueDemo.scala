package DataStructure.Queue.CircularQueue

import DataStructure.Queue.UnidirectionalQueue.ArrayQueue

import scala.io.StdIn

object CircleArrayQueueDemo {

  def main(args: Array[String]): Unit = {
    // 初始化队列
    val queue = new CircleArrayQueueDemo(4)
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

// 环形的队列和前面的单向队列有类似的地方，因此我们修改即可
class CircleArrayQueueDemo(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize) // 该数组存放数据，模拟队列
  var front = 0 // 指向队列头部
  var rear = 0 // 指向队列尾部

  // 判断队列满的方法
  def isFull(): Boolean = {
    (rear + 1) % maxSize == front
  }

  // 判断队列空的方法
  def isEmpty(): Boolean = {
    rear == front
  }

  // 添加数据
  def addQueue(n: Int): Unit = {
    // 判断是否满
    if (isFull()) {
      println("队列满，无法加入")
      return
    }
    // 将数据加入
    arr(rear) = n
    // 将rear后移
    rear = (rear + 1) % maxSize
  }

  // 取出数据
  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    // 这里我们需要分析出来，front已经指向了队列的头元素
    // 1、先把front对应的数据保存到变量
    val value = arr(front)
    // 2、将front后移
    front = (front + 1) % maxSize
    // 3、返回前面保存的变量值
    value
  }

  // 显示队列的所有数据
  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列空，没有数据")
      return
    }
    for (i <- front until front + size) {
      printf("arr[%d]=%d\n", i % maxSize, arr(i % maxSize))
    }
  }

  // 求出当前环形队列有几个元素
  def size(): Int = {
    (rear + maxSize - front) % maxSize
  }

  // 查看队列的头元素，但是不是改变队列
  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    arr(front)
  }

}
