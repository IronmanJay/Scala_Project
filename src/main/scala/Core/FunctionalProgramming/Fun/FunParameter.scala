package Core.FunctionalProgramming.Fun

object FunParameter {

  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x

    val res = Array(1, 2, 3, 4).map(plus(_))
    println(res.mkString(","))
  }

}
