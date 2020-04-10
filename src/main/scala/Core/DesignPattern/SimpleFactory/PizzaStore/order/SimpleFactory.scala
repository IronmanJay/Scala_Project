package Core.DesignPattern.SimpleFactory.PizzaStore.order

import Core.DesignPattern.SimpleFactory.PizzaStore.pizza.{CheesePizza, GreekPizza, PapperPizza, Pizza}

object SimpleFactory {

  def createPizza(t: String): Pizza = {
    var pizza:Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PapperPizza
    }else if(t.equals("cheese")){
      pizza = new CheesePizza
    }
    pizza
  }

}
