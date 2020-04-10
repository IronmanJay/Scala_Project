package Core.AdvancedFeatures.Task

object Exercise03 {
  def main(args: Array[String]): Unit = {
    println(Suits)
    println(Suits.isRed(Suits.Heart))
  }
}

object Suits extends Enumeration {
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")

  override def toString(): String = {
    Suits.values.mkString(",")
  }

  def isRed(card: Suits): Unit = {
    if (card == Heart || card == Diamond) {
      true
    } else {
      false
    }
  }
}