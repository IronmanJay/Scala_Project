package Core.Other.ViewBounds

object ViewBoundsDemo01 {

  def main(args: Array[String]): Unit = {
    //使用了隐式转换
    val compareComm01 = new CompareComm(1, 20)
    println(compareComm01.greater)

    val compareComm2 = new CompareComm(Integer.valueOf(20), Integer.valueOf(30))
    println(compareComm2.greater)

    //以前 <: 上界
    val compareComm4 = new CompareComm[java.lang.Float](201.9f, 30.1f)
    println(compareComm4.greater)
    //上面的小数比较，在视图界定的情况下，就可以这样写了
    //这里会进行隐式转换
    val compareComm5 =
    new CompareComm(201.9f, 310.1f)
    println(compareComm5.greater)
  }

}

class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}