package Core.FunctionalProgramming.Fun

object AnonymouseFunction {

  def main(args: Array[String]): Unit = {
    val triple = (x: Double) => 3 * x
    println(triple(3))
  }

}
