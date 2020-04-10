package Core.DesignPattern.AbstractFactory.PizzaStore.order

import Core.DesignPattern.AbstractFactory.PizzaStore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

class BJFactory extends AbsFactory {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new BJPepperPizza
    }
    pizza
  }
}
