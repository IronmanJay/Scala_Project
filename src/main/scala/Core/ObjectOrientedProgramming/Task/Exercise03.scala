package Core.ObjectOrientedProgramming.Task

object Exercise03 {

  def main(args: Array[String]): Unit = {
    countDown(9)
  }

  def countDown(n: Int): Unit = {
    (0 to n).reverse.foreach(println)
  }

}
