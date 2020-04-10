package Core.PatternMatching.Match

object MatchValDemo01 {

  def main(args: Array[String]): Unit = {
    val ch = 'V'
    ch match {
      case '+' => println("ok")
      case mychar => println("ok" + mychar)
      case _ => println("ok")
    }
  }

}
