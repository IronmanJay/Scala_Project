package Core.Aggregate.Stream

object StreamDemo01 {

  def main(args: Array[String]): Unit = {
    // 创建Stream
    def numsForm(n:BigInt):Stream[BigInt] = n #:: numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1)
    // 取出第一个元素
    println(stream1.head)
    println(stream1.tail)
    println(stream1)
  }

}
