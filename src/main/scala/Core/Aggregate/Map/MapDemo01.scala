package Core.Aggregate.Map

import scala.collection.mutable

object MapDemo01 {

  def main(args: Array[String]): Unit = {
    // 默认Map是immutable.map
    // key,value类型支持any
    // 在map底层，每对key，value是Tuple2
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotliin" -> "北京")
    println(map1)

    // 构造可变映射
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotliin" -> "北京")
    println(map2)

    // 创建空的映射
    val map3 = new mutable.HashMap[String, Int]
    println(map3)

    // 对偶元组
    val map4 = mutable.Map(("A", 1), ("B", 2), ("C", 3))
    println(map4)

    // 取元素方式一
    println(map4("A"))
    // 取元素方式二
    if (map4.contains("B")) {
      println("key存在，值为:" + map4("B"))
    } else {
      println("key不存在")
    }
    // 取元素方式三
    println(map4.get("B"))
    println(map4.get("B").get)
    // 取元素方式四
    println(map4.getOrElse("G", "默认的值"))

    // 更新元素
    map2("Bob") = 200
    map2("zhaoyue") = 123
    println(map2)

    // 添加元素
    map2 += ("R" -> 50, "K" -> 80)
    println(map2)

    // 删除元素
    map2 -= ("K", "R")
    println(map2)
    println("=============")

    // map遍历
    for ((k, v) <- map2) println(k + v)
    println("=============")
    for (v <- map2.keys) println(v)
    println("=============")
    for (v <- map2.values) println(v)
    println("=============")
    for (v <- map1) println(v)

  }

}
