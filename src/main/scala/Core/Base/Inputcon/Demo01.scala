package Core.Base.Inputcon

import scala.io.StdIn

object Demo01 {

  // 定义方法
  def hi(): Unit = {
    println("hi")
  }

  def main(args: Array[String]): Unit = {
    /*要求：可以从控制台接收用户信息，【姓名，年龄，薪水】*/
    println("请输入性名:")
    val name = StdIn.readLine()
    println("请输入年龄:")
    val age = StdIn.readInt()
    println("请输入薪水:")
    val sal = StdIn.readDouble()
    printf("用户的信息为：name=%s,age=%d,sal=%.2f", name, age, sal)
    println()

    hi()

    Cat.sayHi()
    Cat.sayHello()
  }

}

// 声明一个对象（伴生对象）
object Cat extends AAA {
  // 方法
  def sayHi(): Unit = {
    println("小狗汪汪叫")
  }
}

trait AAA {
  def sayHello(): Unit = { // AAA是特质，等价于java中的interface + abstract class
    println("AAA sayHello")
  }
}