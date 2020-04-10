package Core.Aggregate.Queue

object OperatorOverLoad {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat + 10
    cat.+(9)
    println(cat.age)
  }

}

class Cat{
  var age = 0
  def +(n:Int): Unit ={
    this.age += n
  }
}
