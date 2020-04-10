package Core.Aggregate.Map

object FilterDemo01 {

  def main(args: Array[String]): Unit = {
    //选出首字母为A的元素
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.filter(startA)
    println(names)
    println(names2)
  }

  def startA(string: String): Boolean = {
    string.startsWith("A")
  }

}
