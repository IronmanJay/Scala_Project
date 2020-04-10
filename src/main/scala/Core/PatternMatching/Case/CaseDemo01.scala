package Core.PatternMatching.Case

object CaseDemo01 {

  def main(args: Array[String]): Unit = {
    println("hello")
  }

}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
