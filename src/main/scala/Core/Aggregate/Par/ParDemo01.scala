package Core.Aggregate.Par

object ParDemo01 {

  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println(_))
    println()
    (1 to 5).par.foreach(println(_))
  }

}
