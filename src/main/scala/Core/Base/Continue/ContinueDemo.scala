package Core.Base.Continue

object ContinueDemo {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 1 to 10
    //2. 循环守卫 if (i != 2 && i != 3) 这个条件为ture,才执行循环体
    //   即当i ==2 或者 i == 3时，就跳过
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }
    // 上面的代码也可以写成
    println("----------------------")
    for (i <- 1 to 10) {
      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }
  }
}
