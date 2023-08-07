object t7q2 {
  def main(args: Array[String]): Unit = {
    println(calculateSquare(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))
  }
  def square(x:Int): Int = {
    x*x
  }

  def calculateSquare(newArray: Array[Int]): Array[Int] = {
    newArray.map(square)
  }
}
