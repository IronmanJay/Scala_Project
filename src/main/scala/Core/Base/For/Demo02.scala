package Core.Base.For

object Demo02 {

  def main(args: Array[String]): Unit = {
    var start = 1
    var end = 11
    for (i <- start until end) {
      println("hello" + i)
    }
  }

}
