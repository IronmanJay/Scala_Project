package Core.PatternMatching.Case

object CaseDemo03 {

  def main(args: Array[String]): Unit = {
    val amt = new Currency3(3000, "RMB")
    val amt2 = amt.copy()
    println(amt2.value + "" + amt2.unit)
    println(amt2)
    println("=====================")
    val amt3 = amt.copy(value = 8000.0)
    println(amt3)
  }

}

abstract class Amount3

case class Dollar3(value: Double) extends Amount3

case class Currency3(value: Double, unit: String) extends Amount3

case object NoAmount3 extends Amount3