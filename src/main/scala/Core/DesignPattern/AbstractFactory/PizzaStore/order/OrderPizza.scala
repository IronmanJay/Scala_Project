package Core.DesignPattern.AbstractFactory.PizzaStore.order

import Core.DesignPattern.AbstractFactory.PizzaStore.pizza
import Core.DesignPattern.AbstractFactory.PizzaStore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

class OrderPizza {

  var absFactory: AbsFactory = _

  def this(absFactory: AbsFactory) {
    this
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("请输入pizza的类型:")
        orderType = StdIn.readLine()
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }

}
