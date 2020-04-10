package Core.DesignPattern.Decorator.CoffeeBar.mydecorator

import Core.DesignPattern.Decorator.CoffeeBar.Drink


class Chocolate(obj: Drink) extends Decorator(obj) {

  super.setDescription("Chocolate")
  //一份巧克力3.0f
  super.setPrice(3.0f)

}
