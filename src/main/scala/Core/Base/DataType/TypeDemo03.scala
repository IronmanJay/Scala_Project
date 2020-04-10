package Core.Base.DataType

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "最小值" + Long.MinValue)
    var i = 10
    var j = 10l
    var e = 9223372036854775807l //说明9223372036854775807 超过int

    var num1:Float = 2.2345678912f
    var num2:Double = 2.2345678912
    println("num1=" + num1 + "num2" + num2)
  }
}
