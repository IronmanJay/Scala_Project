package Core.PatternMatching.Match

object MatchDemo01 {

  def main(args: Array[String]): Unit = {
    val oper = '*'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println(res)
  }

}
