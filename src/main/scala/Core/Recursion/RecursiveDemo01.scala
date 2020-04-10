package Core.Recursion

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo01 {

  def main(args: Array[String]): Unit = {
    // 传统方式
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前的时间，date=" + date)
    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l)
    while (num < maxVal) {
      res += num
      num += 1
    }
    println("res=" + res)
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("执行后的时间，date=" + date2)
  }

}
