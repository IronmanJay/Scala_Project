package Core.Base.Task

import util.control.Breaks._

object BreakExercise01 {

  def main(args: Array[String]): Unit = {
    /*100以内的数求和，求出当和第一次大于20的当前数*/
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("第一次大于20的当前数=" + i)
          break()
        }
      }
    }
    // 除了上面的break机制中断，也可以使用循环守卫实现中断
    println("--------------------")
    var loop = true
    var sum2 = 0
    for (i <- 1 to 100 if (loop == true)) {
      sum2 += i
      if (sum2 > 20) {
        println("循环守卫执行中断,第一次大于20的当前数=" + i)
        loop = false
      }
    }
  }

}
