package Core.DesignPattern.AbstractFactory.PizzaStore.order


object PizzaStore {

  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
  }

}
