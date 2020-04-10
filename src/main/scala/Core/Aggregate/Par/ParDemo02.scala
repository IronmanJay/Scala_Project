package Core.Aggregate.Par

object ParDemo02 {

  def main(args: Array[String]): Unit = {
    val res1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
    val res2 = (0 to 100).par.map{case _ => Thread.currentThread().getName}.distinct
    println(res1)
    println("===============")
    println(res2)
  }

}
