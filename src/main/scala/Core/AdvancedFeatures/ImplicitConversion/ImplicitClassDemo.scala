package Core.AdvancedFeatures.ImplicitConversion

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    implicit class DB1(val m: MySQL1) {
      def addSuffix(): Unit = {
        println(m + "scala")
      }
    }
    val mySQL = new MySQL1
    mySQL.sayok()
    mySQL.addSuffix()
  }
}

class MySQL1 {
  def sayok(): Unit = {
    println("sayok")
  }
}