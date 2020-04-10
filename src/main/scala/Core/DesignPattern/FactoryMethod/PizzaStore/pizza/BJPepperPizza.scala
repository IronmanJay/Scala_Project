package Core.DesignPattern.FactoryMethod.PizzaStore.pizza

class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京胡椒Pizza"
    println(this.name + "preparing...")
  }
}
