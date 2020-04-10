package Core.Base.DataType

object CharDemo {

  def main(args: Array[String]): Unit = {

    //当我们输出一个char类型时，他会输出该数字对应的字符(码值表unicode)//unicode码值表包括ascii
    var char1: Char = 97
    println("char1=" + char1)

    //char 可以当做数字进行运行
    var char2: Char = 'a'
    var num = char2 + 10
    println(num)

    //原因和分析
    //1. 当把一个计算的结果赋值一个变量，则编译器会进行类型转换及判断（即会看范围+类型）
    //2. 当把一个字面量赋值一个变量，则编译器会进行范围的判定
    //        var c2: Char = 'a' + 1
    //        var c3: Char = 97 + 1
            var c4: Char = 98
            println(c4)
  }

}
