package Core.ObjectOrientedProgramming.Extends

object TypeConvert {

  def main(args: Array[String]): Unit = {
    //ClassOf的使用,可以得到类名、
    println(classOf[String])
    val s = "king"
    println(s.getClass.getName) //使用反射机制
    //isInstanceOf asInstanceOf
    var p1 = new Person200
    var emp = new Person200
    //将子类引用给父类(向上转型,自动)
    p1 = emp
    //将父类的引用重新转成子类引用(多态),即向下转型
    var emp2 = p1.asInstanceOf[Emp]
  }

}

class Person200{
  var name : String = "tom"
  def printName(): Unit ={
    println("Person printName=" + name)
  }
}

class Emp100 extends Person200{
  override def printName(): Unit = {
    println("Emp printName=" + name)
    super.printName()
  }
}