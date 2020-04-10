package Core.ObjectOrientedProgramming.Constructor

import scala.beans.BeanProperty

object BeanPropertDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)
    //使用 @BeanProperty 自动生成 getXxx 和 setXxx
    car.setName("奔驰")
    println(car.getName())
  }
}

class Car{
  @BeanProperty var name : String = null
}