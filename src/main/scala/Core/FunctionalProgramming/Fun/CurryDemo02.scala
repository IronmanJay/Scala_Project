package Core.FunctionalProgramming.Fun

object CurryDemo02 {

  def main(args: Array[String]): Unit = {

    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val str1 = "hello"
    println(str1.checkEq("HELLO")(eq))

    // 简写形式
    println(str1.checkEq("HELLO")(_.equals(_)))

  }

}
