package Core.DesignPattern.Decorator.CoffeeBar.mydecorator

import Core.DesignPattern.Decorator.CoffeeBar.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
