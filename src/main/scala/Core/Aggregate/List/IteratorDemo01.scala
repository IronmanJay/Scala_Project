package Core.Aggregate.List

object IteratorDemo01 {

  def main(args: Array[String]): Unit = {
    val iterator = List(1,2,3,4,5).iterator
    println("---------遍历方式1---------")
    while(iterator.hasNext){
      println(iterator.next())
    }
    println("---------遍历方式2---------")
    for(enum <- iterator){
      println(enum)
    }
  }

}
