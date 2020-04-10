package Core.AdvancedFeatures.Task

object Exercise01 {
  def main(args: Array[String]): Unit = {
    var point = Point(3, 4)
    println(point)
  }
}

class Point(x: Int = 0, y: Int = 0) {
  var x1 = x
  var y1 = y
  println(x1)
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
