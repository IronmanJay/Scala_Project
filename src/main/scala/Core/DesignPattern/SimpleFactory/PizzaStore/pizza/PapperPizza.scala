package Core.DesignPattern.SimpleFactory.PizzaStore.pizza

class PapperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + "preparing")
  }
}
