package Core.Base.Task

object GetString {

  def main(args: Array[String]): Unit = {
    println("hello".take(1))
    println("hello"(0))
    println("hello".reverse.take(1))
    println("hello".takeRight(1))
  }

}
