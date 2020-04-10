package Core.Base.Task

object ForExercise01 {
  /*
      for循环练习题(学员先做)
    打印1~100之间所有是9的倍数的整数的个数及总和.
    完成下面的表达式输出
       */
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 100
    var count = 0
    var sum = 0
    for (i <- start to end) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    printf("count=%d,sum=%d", count, sum)

    //输出加法的循环表达式
    val num = 6;
    for (i <- 0 to num) {
      printf("%d+%d=%d\n", i, (num - i), num)
    }

    var list = List(1,2)

  }
}
