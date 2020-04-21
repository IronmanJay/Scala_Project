package DataStructure.Sort

import scala.io.StdIn

object ThreeNumSort {

  def main(args: Array[String]): Unit = {
    println("请输入三个数字:")
    var a = StdIn.readInt()
    var b = StdIn.readInt()
    var c = StdIn.readInt()
    if(b > a){
      var temp = a
      a = b
      b = temp
    }
    if(c > a){
      var temp = c
      c = a
      a = temp
    }
    if(c > b){
      var temp = c
      c = b
      b = temp
    }
    println("结果为:" + c + b + a)
  }

}
