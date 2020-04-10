package Core.ObjectOrientedProgramming.Constructor

object ConDemo01 {

  def main(args: Array[String]): Unit = {
//    var p1 = new Person("jack",20)
//    println(p1)
    // 下面这句话就会调用辅助构造器
    val p2 = new Person("tom")
    println(p2)
  }

}

// 构造器
class Person(inname:String,inage:Int) {
  var name = inname
  var age = inage

  override def toString: String = {
    "name=" + this.name + "age=" + this.age
  }

  def this(name:String) {
    //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("jack", 10)
    //this
    this.name = name //重新赋值
  }
}
