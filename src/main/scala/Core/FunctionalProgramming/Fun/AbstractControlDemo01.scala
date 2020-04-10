package Core.FunctionalProgramming.Fun

object AbstractControlDemo01 {

  def main(args: Array[String]): Unit = {
    //    def myRunInThread(f1: () => Unit) = {
    //      new Thread {
    //        override def run(): Unit = {
    //          f1()
    //        }
    //      }.start()
    //    }
    //    myRunInThread{
    //      ()=>
    //        println("干活喽,5秒完成")
    //        Thread.sleep(5000)
    //        println("干完喽")
    //    }

    def myRunInThread(f1: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }

    myRunInThread {
      println("干活喽,5秒完成")
      Thread.sleep(5000)
      println("干完喽")
    }
  }

}
