package Core.ObjectOrientedProgramming.Extends

object TypeConvertCase {

  def main(args: Array[String]): Unit = {
    val stu = new Student400
    val emp = new Emp400
    test(stu)
    test(emp)
  }

  // 写了一个参数多态的代码
  // 因为在oop中一个父类的引用可以接收所有子类的引用,多态(参数多态)
  def test(p: Person400): Unit = {
    // 使用Scala中类型检查和转换
    if (p.isInstanceOf[Emp400]) {
      p.asInstanceOf[Emp400].showInfo()
    } else if (p.isInstanceOf[Student400]) {
      p.asInstanceOf[Student400].cry()
    } else {
      println("转换失败")
    }
  }

}

class Person400 {
  def printName: Unit = {
    println("Person400 printName")
  }

  def sayOk: Unit = {
    println("Person400 sayok")
  }
}

class Student400 extends Person400 {
  val stuId = 100

  override def printName: Unit = {
    println("Student400 sayok")
  }

  def cry(): Unit = {
    println("学生的id=" + this.stuId)
  }
}

class Emp400 extends Person400 {
  val empId = 800

  override def printName: Unit = {
    println("Emp400 printName")
  }

  def showInfo(): Unit = {
    println("雇员的id=" + this.empId)
  }
}