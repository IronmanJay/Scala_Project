package Core.FunctionalProgramming.PartialFun

object PartialFunDemo02 {

  def main(args: Array[String]): Unit = {
    // 使用偏函数解决
    val list = List(1, 2, 3, 4, "abc")
    // 定义一个偏函数
    val partialFun = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        if (x.isInstanceOf[Int]) true else false
      }

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }
    // 使用偏函数
    val res = list.collect(partialFun)
    println(res)
  }

}
