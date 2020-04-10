package Core.Base.DataType

object TypeDemo02 {

  def main(args: Array[String]): Unit = {
    printf(sayHello)
    var num = 1.2 // 默认为Double
    var num2 = 1.7f // 这时一个Float
    num2 = num.toFloat
  }
  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有没有正常返回值
  def sayHello : Nothing = {
    throw new Exception("抛出异常")
  }

}

