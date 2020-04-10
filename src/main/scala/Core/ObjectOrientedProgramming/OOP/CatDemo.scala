package Core.ObjectOrientedProgramming.OOP

object CatDemo {

  def main(args: Array[String]): Unit = {
    // 创建一只猫
    val cat = new Cat()
    // 给猫的属性赋值
    //说明
    //1. cat.name = "小白" 其实不是直接访问属性，而是  cat.name_$eq("小白")
    //2. cat.name 等价于 cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println("ok")
    printf("小猫的信息如下:%s %d %s",cat.name,cat.age,cat.color)
  }

}

// 定义一个类Cat
//一个class Cat 对应的字节码文件只有一个 Cat.class ,默认是public
class Cat {
  // 定义/声明三个属性
  //说明
  //1. 当我们声明了 var name :String时, 在底层对应 private name
  //2. 同时会生成 两个public方法 name() <=类似=> getter  public name_$eq() => setter
  var name: String = "" // 给初始值，scala不默认初始值
  var age: Int = _ // 下划线表示给变量一个默认的值，如果是Int默认就是0
  var color: String = _

}
