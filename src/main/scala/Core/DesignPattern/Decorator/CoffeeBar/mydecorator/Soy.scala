package Core.DesignPattern.Decorator.CoffeeBar.mydecorator

import Core.DesignPattern.Decorator.CoffeeBar.Drink


class Soy(obj: Drink) extends Decorator(obj) {
  setDescription("Soy")
  setPrice(1.5f)
}
