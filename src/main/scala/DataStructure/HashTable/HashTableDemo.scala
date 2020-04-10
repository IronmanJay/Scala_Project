package DataStructure.HashTable

import scala.io.StdIn
import util.control.Breaks._

object HashTableDemo {

  def main(args: Array[String]): Unit = {
    // 创建hashTable
    val hashTable = new HashTable(7)
    // 测试
    var key = " "
    while (true) {
      println("add：添加雇员")
      println("list：显示雇员")
      println("find：查找雇员")
      println("exit：退出系统")
      key = StdIn.readLine()
      key match {
        case "add" => {
          println("输入id")
          val id = StdIn.readInt()
          println("输入名字")
          val name = StdIn.readLine()
          val emp = new Emp(id, name)
          hashTable.add(emp)
        }
        case "find" => {
          println("输入要查找的id")
          val id = StdIn.readInt()
          hashTable.findEmpById(id)
        }
        case "list" => {
          hashTable.list()
        }
      }
    }
  }

}

// 创建Emp类
class Emp(eId: Int, eName: String) {
  val id = eId
  var name = eName
  var next: Emp = null
}

// 创建EmpLinkedList
class EmpLinkedList {
  // 定义头指针，这里的head会直接指向一个雇员
  var head: Emp = null

  // 添加方法
  // 假定添加的雇员的id是自增的，即雇员分配的id总是从小到大
  // 找到链表的最后加入即可
  def add(emp: Emp): Unit = {
    // 如果是第一个雇员
    if (head == null) {
      head = emp
      return
    }
    // 定义辅助指针
    var cur = head
    breakable {
      while (true) {
        if (cur.next == null) {
          break()
        }
        cur = cur.next
      }
    }
    // 这时，cur指向了链表的最后
    cur.next = emp
  }

  // 遍历链表方法
  def list(i: Int): Unit = {
    if (head == null) {
      println(s"第${i}条链表为空")
      return
    }
    print(s"第${i}条链表的信息为\t")
    // 定义辅助指针
    var cur = head
    breakable {
      while (true) {
        if (cur == null) {
          break()
        }
        // 输出雇员信息
        printf(" => no=%d,name=%s\t", cur.id, cur.name)
        cur = cur.next
      }
    }
    println()
  }

  // 如果有返回emp，没有返回null
  def findEmpById(id: Int): Emp = {
    // 遍历
    if (head == null) {
      println("链表为空，没有数据")
      return null
    }
    var cur = head
    breakable {
      while (true) {
        if (cur == null) {
          break()
        }
        if (cur.id == id) { // 找到
          break()
        }
        cur = cur.next
      }
    }
    cur
  }

}

class HashTable(val size: Int) {
  val empLinkedListArr: Array[EmpLinkedList] = new Array[EmpLinkedList](size)
  // 初始化链表的各个元素
  for (i <- 0 until size) {
    empLinkedListArr(i) = new EmpLinkedList
  }

  def add(emp: Emp): Unit = {
    // 得到该员工应该加入到哪条链表
    val empLinkedListNo = hashFun(emp.id)
    empLinkedListArr(empLinkedListNo).add(emp)
  }

  def list(): Unit = { // 遍历整个hash表
    for (i <- 0 until size) {
      empLinkedListArr(i).list(i)
    }
  }

  // findEmpById
  def findEmpById(id: Int): Unit = {
    // 得到该员工应该加入到哪条链表
    val empLinkedListNo = hashFun(id)
    val emp = this.empLinkedListArr(empLinkedListNo).findEmpById(id)
    if (emp != null) { // 找到
      printf(s"在第${empLinkedListNo}条链表找到id=%d name=%s\n", id, emp.name)
    } else { // 沒有找到
      printf("沒有找到id为%d的人\n", id)
    }
  }

  // 散列函数
  def hashFun(id: Int): Int = {
    id % size
  }

}

