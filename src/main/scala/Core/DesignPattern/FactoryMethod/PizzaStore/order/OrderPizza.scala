package Core.DesignPattern.FactoryMethod.PizzaStore.order

import Core.DesignPattern.FactoryMethod.PizzaStore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

abstract class OrderPizza {


  breakable {
    var orderType: String = null
    var pizza: Pizza = null
    do {
      println("请输入pizza的类型:")
      orderType = StdIn.readLine()
      pizza = createPizza(orderType)
      if (pizza == null) {
        break()
      }
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)
  }

  def createPizza(t: String): Pizza

}
