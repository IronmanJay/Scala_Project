package Core.Base.For

object ForVar {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = 4 - i) {
      println(j + " ")
    }
    println()
  }

}
