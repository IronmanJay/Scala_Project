package Core.Base.For

object RangeFor {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i=" + i)
    }
    // 步长控制为2
    println("---------------------")
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }
    // 控制步长的第二种方式-for循环守卫
    println("---------------------")
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i=" + i)
    }
  }

}
