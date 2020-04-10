package Core.Base.Notice

object Demo01 {

  def main(args: Array[String]): Unit = {
    val num1 = if (5 > 4) 5 else 4
    //val num2 = 5 > 4 ? 5 : 4 错误

    /**
     * 案例1：求两个数的最大值
     * 案例2：求三个数的最大值
     */
    val n1 = 4
    val n2 = 8
    var res = if (n1 > n2) n1 else n2
    println("res = " + res)

    val n3 = 11
    res = if (res > n3) res else n3
    println("res = " + res)

    // 逗号运算符
    println("hello", "abc" + "uuu", "kkk")

  }

}
