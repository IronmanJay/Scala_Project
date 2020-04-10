package Core.ObjectOrientedProgramming.Constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new A("jack")
  }
}

class B{
  println("b")
}

class A extends B{
  def this(name:String){
    this // 调用A的主构造器
    println("A this(name:String)")
  }
}