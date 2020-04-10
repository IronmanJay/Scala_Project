package Core.Base.Task

import scala.io.StdIn

object LoopExercise01 {

  def main(args: Array[String]): Unit = {
    /*
 应用实例：
1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
 分析思路
 (1) classNum 表示 班级个数 , stuNum 表示学生个数
 (2) classScore 表示各个班级总分 totalScore 表示所有班级总分
 (3) score 表示各个学生成绩
 (4) 使用循环的方式输入成绩
  */
    val classNum = 3
    val stuNum = 5
    var score = 0.0 // 学生分数
    var classScore = 0.0 // 班级总分
    var totalScore = 0.0 // 所有班级总分
    for (i <- 1 to classNum) {
      // 先将classScore清零
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班级的第%d号学生的成绩\n", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      // 累计totalScore
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%2.f", totalScore / (stuNum * classNum))
  }

}
