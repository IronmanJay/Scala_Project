package Core.DesignPattern.FactoryMethod.PizzaStore.pizza

class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪pizza"
    println(this.name + "preparing")
  }
}
