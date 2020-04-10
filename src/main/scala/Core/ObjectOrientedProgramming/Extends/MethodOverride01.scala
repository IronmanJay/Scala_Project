package Core.ObjectOrientedProgramming.Extends

object MethodOverride01 {

  def main(args: Array[String]): Unit = {
    var emp = new Emp
    emp.printName()
  }

}

class Person100{
  var name : String = "tom"
  def printName(): Unit ={
    println("Person printName=" + name)
  }
}

class Emp extends Person100{
  override def printName(): Unit = {
    println("Emp printName=" + name)
    super.printName()
  }
}
