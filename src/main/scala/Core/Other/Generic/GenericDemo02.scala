package Core.Other.Generic


object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    val list1 = List("hello", "dog", "world")
    val list2 = List(90,10,23)
    println(midList[String](list1))
    println(midList[Int](list2))
  }

  def midList[E](l: List[E]): E = {
    l(l.length / 2)
  }

}
