package Core.FunctionalProgramming.Fun

object ClosureDemo {

  def main(args: Array[String]): Unit = {
    val f = makeSuffix(".jpg")
    println(f("dog.jpg"))
    println(f("cat"))
  }

  def makeSuffix(suffix: String) = {
    // 返回一个匿名函数
    (filename: String) => {
      if (filename.endsWith(suffix)) {
        filename
      } else {
        filename + suffix
      }
    }
  }

}
