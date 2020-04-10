package Core.Base.Vars

object VarDemo02 {

  def main(args: Array[String]): Unit = {

    // 类型推导
    var num = 10 // 这时num就是int类型
    //方式1， 可以利用idea的提示来证明,给出提示
    //方式2， 使用isInstanceOf[Int]判断
    println(num.isInstanceOf[Int])

    //类型确定后，就不能修改，说明Scala 是强数据类型语言()
    // num = 2.3, 错误

    //在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改
    var age = 10
    age = 30
    val num2 = 30
    //num2 = 40 // val修饰的变量是不可以改变.

    //scala设计者为什么设计var和val
    // 在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    // 或者是修改对象的属性值, 但是我们很少去改变这个对象本身
    // dog = new Dog()  dog.age = 10  dog = new Dog()
    // 这时，我们就可以使用val
    // 因为val 没有线程安全问题，因此效率高，scala的设计者推荐我们val
    // 如果对象需要改变，则使用var
    val dog = new Dog
    //    dog = new Dog
    dog.age = 90
    dog.name = "小花狗"

  }

}

class Dog{
  // 声明一个age，给了一个默认值
  var age :Int = 0
  // 声明名字
  var name :String = ""
}