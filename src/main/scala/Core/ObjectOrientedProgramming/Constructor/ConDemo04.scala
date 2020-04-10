package Core.ObjectOrientedProgramming.Constructor

object ConDemo04 {

  def main(args: Array[String]): Unit = {
    val worker = new worker("smith")
    worker.name // 不能访问inName
    val worker2 = new worker2("smith2")
    worker2.name
    worker2.inName // 可以访问inName
    val worker3 = new worker3("jack")
    worker3.name
    worker3.inName = "marry" // 可以读写inName
    println(worker3.inName)
  }

}

//1. 如果主构造器是Worker(inName: String) ，那么inName就是一个局部变量
class worker(inName: String) {
  var name = inName
}

//2. 如果主构造器是Worker2(val inName: String) ，那么inName就是Worker2的一个private的只读属性
class worker2(val inName: String) {
  var name = inName
}

//3. 如果主构造器是Worker3(var inName: String) ，那么  inName就是Worker3的一个
//   一个private的可以读写属性
class worker3(var inName: String) {
  var name = inName
}