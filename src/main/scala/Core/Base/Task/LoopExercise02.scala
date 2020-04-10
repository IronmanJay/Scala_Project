package Core.Base.Task

import scala.io.StdIn

object LoopExercise02 {

  def main(args: Array[String]): Unit = {
    // 2.统计三个班及格人数，每个班有5名同学。
    val classNum = 3
    val stuNum = 5
    var score = 0.0 // 学生分数
    var classScore = 0.0 // 班级总分
    var totalScore = 0.0 // 所有班级总分
    var passNum = 0 // 统计及格人数
    for (i <- 1 to classNum) {
      // 先将classScore清零
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班级的第%d号学生的成绩\n", i, j)
        score = StdIn.readDouble()
        if (score >= 60) {
          passNum += 1
        }
        classScore += score
      }
      // 累计totalScore
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%2.f", totalScore / (stuNum * classNum))
    printf("所有班级的及格人数有%d个", passNum)
  }

}
