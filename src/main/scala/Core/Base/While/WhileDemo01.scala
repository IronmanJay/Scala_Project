package Core.Base.While

object WhileDemo01 {

  def main(args: Array[String]): Unit = {
    //输出10句 hello,尚硅谷
    //1. 定义循环变量
    var i = 0
    while (i < 10) { // 循环条件
      println("IronmanJay" + i) // 循环体
      //2.循环变量迭代
      i += 1
    }
  }

}
