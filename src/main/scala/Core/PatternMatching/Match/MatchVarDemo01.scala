package Core.PatternMatching.Match

object MatchVarDemo01 {

  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    println(x)
    val (q, r) = BigInt(10) /% 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    println(first, second)

  }

}
