package Core.DesignPattern.Singleton

object TestSingleTon2 {

  def main(args: Array[String]): Unit = {
    val instance1 = SingleTon2.getInstance
    val instance2 = SingleTon2.getInstance
    if (instance1 == instance2) {
      println("相等")
    }
  }

}

class SingleTon2 private() {}

// 饿汉式
object SingleTon2 {

  private val s: SingleTon2 = new SingleTon2

  def getInstance = {
    s
  }
}
