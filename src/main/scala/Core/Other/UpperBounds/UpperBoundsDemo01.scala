package Core.Other.UpperBounds

object UpperBoundsDemo01 {

  def main(args: Array[String]): Unit = {
    val compareInt = new CompareInt(10, 40)
    println(compareInt.greater)
    val commonCompare1 = new CommonCompare(java.lang.Float.valueOf(10.1f), java.lang.Float.valueOf(40.8f))
    println(commonCompare1.greater)
    val commonCompare2 = new CommonCompare[java.lang.Float](10.1f, 40.8f)
    println(commonCompare2.greater)
  }

}

class CompareInt(n1: Int, n2: Int) {
  def greater = if (n1 > n2) n1 else n2
}

class CommonCompare[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
