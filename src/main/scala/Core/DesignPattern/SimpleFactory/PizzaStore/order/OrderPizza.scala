package Core.DesignPattern.SimpleFactory.PizzaStore.order

import Core.DesignPattern.SimpleFactory.PizzaStore.pizza.{GreekPizza, PapperPizza, Pizza}

import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {

  var orderType: String = _
  var pizza: Pizza = _
  breakable {
    do {
      println("请输入pizza的类型:")
      orderType = StdIn.readLine()
      pizza = SimpleFactory.createPizza(orderType)
      if (pizza == null) {
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }

}
