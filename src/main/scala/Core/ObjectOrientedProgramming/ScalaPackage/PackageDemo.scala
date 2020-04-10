////代码说明
//1. package com.atguigu{}  表示我们创建了包 com.atguigu ,在{}中
//   我们可以继续写它的子包 scala //com.atguigu.scala, 还可以写类,特质trait,还可以写object
//2. 即sacla支持，在一个文件中，可以同时创建多个包，以及给各个包创建类,trait和object
package Core.ObjectOrientedProgramming {

  class User {

  }

  package scala2 {

    class User {

    }

  }
  //说明
  //1. 在包中直接写方法，或者定义变量，就错误==>使用包对象的技术来解决
  //2. package object scala 表示创建一个包对象 scala, 他是ScalaPackage这个包对应的包对象
  //3. 每一个包都可以有一个包对象
  //4. 包对象的名字需要和子包一样
  //5. 在包对象中可以定义变量，方法
  //6. 在包对象中定义的变量和方法，就可以在对应的包中使用
  //7. 在底层这个包对象会生成两个类 package.class  和 package$.class
  package object ScalaPackage{
    val name = "king"
    def sayHi(): Unit ={
      println("package object ScalaPackage sayHI~")
    }
  }

  package ScalaPackage {

    class Person { // 在com.atguigu包下创建个 User类
      val name = "Nick"

      def play(message: String): Unit = {
        println(this.name + " " + message)
      }
    }

    class User {

    }

    object Test {
      def main(args: Array[String]): Unit = {
        println("ok")

        println("使用name=" + name)
        // 使用包对象方法
        sayHi()

        // 可以直接使用父包的内容
        // 1.如果有同名的类，则采用就近原则来使用内容(比如包)
        // 2.如果就是要使用父包的类，则指定路径即可
        val user = new User
        println("user=" + user)
        val user2 = new Core.ObjectOrientedProgramming.User
      }
    }

  }

}