package Core.PatternMatching.Case

object MidCase {

  def main(args: Array[String]): Unit = {
    List(1,3,5,9) match {
      case first :: second :: rest => println(first + second + rest.length)
      case _ => println("匹配不到")
    }
  }

}
