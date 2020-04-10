package Core.Aggregate.Set

import scala.collection.mutable

object SetDemo01 {

  def main(args: Array[String]): Unit = {
    // 不可变
    val set1 = Set(1, 2, 3)
    println(set1)
    // 可变
    val set2 = mutable.Set(1, 2, "hello")
    println(set2)
    // 添加（可变）
    set2 += 6
    set2.+=(5)
    println(set2)
    // 删除
    set2.remove(5)
    println(set2)
    // 遍历
    for (item <- set2) {
      println(item)
    }

  }

}
