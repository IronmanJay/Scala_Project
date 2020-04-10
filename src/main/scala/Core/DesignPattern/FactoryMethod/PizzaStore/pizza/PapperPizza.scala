package Core.DesignPattern.FactoryMethod.PizzaStore.pizza

class PapperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + "preparing")
  }
}
