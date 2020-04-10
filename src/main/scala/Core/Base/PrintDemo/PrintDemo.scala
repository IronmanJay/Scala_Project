package Core.Base.PrintDemo

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1:String = "hello"
    var str2:String = "world"
    println(str1+str2)

    var name:String = "tom"
    var age:Int = 10
    var sal:Float = 10.67f
    var height:Double = 180.15
    printf("名字是%s,年龄是%d,薪水%f,身高%f",name,age,sal,height)

    println(s"个人信息如下:\n名字:$name\n年龄:$age\n薪水:$sal\n身高:$height")
  }
}
