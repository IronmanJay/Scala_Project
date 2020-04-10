package Core.ObjectOrientedProgramming.OOP

object MemState {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2
    p1.name = "jack"
    p1.age = 10
    val p2 = p1
    println(p1==p2) // true
    p1.name = "tom"
    println(p2.name)
    println(p1.name)
    p2.name = "赵越"
    println(p1.name)
    println(p2.name)
  }
}

class Person2 {
  var name = ""
  var age : Int = _ // 如果以下划线的方式给默认值，则属性必须指定类型
}
