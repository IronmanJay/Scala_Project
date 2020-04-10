package Core.Base.Task

import scala.io.StdIn

object IfElse05 {

  def main(args: Array[String]): Unit = {
    /*
  应用案例2
    出票系统：根据淡旺季的月份和年龄，打印票价

  4_10 旺季：
    成人（18-60）：60
    儿童（<18）:半价
    老人（>60）:1/3

  淡季：
    成人：40
    其他：20
    思路分析
    1. 定义至少三个变量 month , age, ticket
    2. 逻辑上有月份和年龄的判断因此，会使用嵌套分支
    3. 根据对应的业务逻辑完成代码
    走代码
     */
    println("请输入当前月份：")
    val month = StdIn.readInt()
    println("请输入年龄：")
    val age = StdIn.readInt()
    val ticket = 60

    if (month >= 4 && month <= 10) {
      if (age < 18) {
        println("票价为" + ticket / 2)
      } else if (age > 18 && age < 60) {
        println("票价为：" + ticket)
      } else {
        println("票价为：" + ticket / 3)
      }
    } else {
      if(age > 18 && age < 60){
        println("票价为：" + 40)
      }else{
        println("票价为：" + 20)
      }
    }

  }

}
