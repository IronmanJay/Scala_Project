package Core.Recursion

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo02 {

  def main(args: Array[String]): Unit = {
    // 递归方式
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前的时间，date=" + date)
    var num = BigInt(0)
    var sum = BigInt(1)
    var res = mx(num, sum)
    println("res=" + res)
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("执行后的时间，date=" + date2)
  }

  def mx(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 99999999l) return mx(num + 1, sum + num)
    else return sum
  }

}
