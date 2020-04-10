package Core.Aggregate.Queue

import scala.collection.mutable

object QueueDemo01 {

  def main(args: Array[String]): Unit = {
    // 创建队列
    val q1 = new mutable.Queue[Any]
    println(q1)
    // 给队列增加元素
    q1 += 9
    println(q1)
    q1 ++= List(4,5,7)
    println(q1)
    // 从队列头部取出元，q1本身会变化
    val queueElement = q1.dequeue()
    println(queueElement,"\n",q1)
    // 入队列，默认是从队列的尾部加入
    q1.enqueue(100,10,100)
    println(q1)
    // 获取队列的第一个元素
    println(q1.head)
    // 获取队列的最后一个元素
    println(q1.last)
    // 取出队尾数据
    println(q1.tail.tail.tail)
  }

}
