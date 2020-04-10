package Core.FunctionalProgramming.FunDetails

object Details03 {

  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("f1")
    }

    println("ok")

    def sayOK(): Unit = {
      println("main sayOk")
      def sayOK(): Unit = {
        println("sayok sayOk")
      }
    }
  }

  def sayOK(): Unit = {
    println("main sayOk")
  }

}
