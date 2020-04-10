package Core.Base.For

object Demo01 {

  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    for (i <- start to end) {
      println("hello" + i)
    }

    // 说明for这种推导式，也可以直接对集合进行遍历
    var list = List("hello",10,30,"tom")
    for (item <- list){
      println(item)
    }
  }

}
