package Core.PatternMatching.Match

object MatchObjectDemo01 {

  def main(args: Array[String]): Unit = {
    // 模式匹配使用
    val number: Double = 36.0
    number match {
      //说明 case Square(n) 的运行的机制
      //1. 当匹配到 case Square(n)
      //2. 调用Square 的 unapply(z: Double),z 的值就是 number
      //3. 如果对象提取器 unapply(z: Double) 返回的是Some(6) ,则表示匹配成功，同时将6赋给 Square(n) 的n
      //4. 如果对象提取器 unapply(z: Double) 返回的是None ,则表示匹配不成功
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }

}

//说明
//1. unapply方法是对象提取器
//2. 接收z:Double 类型
//3. 返回类型是Option[Double]
//4. 返回的值是 Some(math.sqrt(z)) 返回z的开平方的值，并放入到Some(x)
object Square {
  def unapply(z: Double): Option[Double] = Some(math.sqrt(z))

  def apply(z: Double): Double = z * z
}
