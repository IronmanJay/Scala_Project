package Core.Aggregate.List

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = List(1, 2, 3, "hello")
    println(list01)
    val list02 = Nil
    println(list02)
    // 访问List的元素
    val value1 = list01(1)
    println(value1)
    // 追加数据
    var list03 = list01 :+ 4
    println(list01)
    println(list03)
    val list04 = 10 +: list01
    println(list04)
    val list05 = 4 :: 5 :: 6 :: list01 :: Nil
    println(list05)
    val list06 = 4 :: 5 :: 6 :: list04 ::: Nil
    println(list06)
    val list07 = 4 :: 5 :: list02 ::: list01 :: Nil
    println(list07)
  }
}
