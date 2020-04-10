package Core.DesignPattern.Singleton

object TestSingleTon {

  def main(args: Array[String]): Unit = {
    val instance1 = SingleTon.getInstance
    val instance2 = SingleTon.getInstance
    if(instance1 == instance2){
      println("相等")
    }
  }

}

class SingleTon private() {}

// 懒汉式
object SingleTon {
  private var s: SingleTon = null

  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}
