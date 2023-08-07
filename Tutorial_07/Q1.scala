object t7q1 {
  def main(args: Array[String]): Unit = {
    println(filterEvenNumbers(Array(1,2,3,4,5,6,7,8,9,10)).mkString("Array(", ", ", ")"))
  }
  def isEven(x:Int): Boolean= {
    if(x%2==0) {
      true
    }
    else {
      false
    }
  }

  def filterEvenNumbers(newArray: Array[Int]): Array[Int] = {
    newArray.filter(isEven)
  }
}
