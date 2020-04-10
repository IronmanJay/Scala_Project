package Core.PatternMatching.Match

object MatchIfDemo01 {

  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ if ch > 1110 => println("ch > 10")
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }
  }

}
