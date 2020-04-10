package Core.DesignPattern.AbstractFactory.PizzaStore.order

import Core.DesignPattern.AbstractFactory.PizzaStore.pizza.Pizza

trait AbsFactory {

  def createPizza(t: String): Pizza

}
