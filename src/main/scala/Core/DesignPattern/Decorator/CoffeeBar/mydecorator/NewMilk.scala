package Core.DesignPattern.Decorator.CoffeeBar.mydecorator

import Core.DesignPattern.Decorator.CoffeeBar.Drink


class NewMilk(obj: Drink) extends Decorator(obj) {

  setDescription("新式Milk")
  setPrice(4.0f)
}