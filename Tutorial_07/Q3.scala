object t7q3 {
  def main(args: Array[String]): Unit = {
    println(filterPrime(Array(1,2,3,4,5,6,7,8,9,10)).mkString("Array(", ", ", ")"))
  }
  def isPrime(x:Int): Boolean= {
    if(x==1)
    {
      false
    }
    else {
      var flag = true
      var y = 2
      while (y < x) {

        if (x % y == 0) {
          flag = false
        }
        y = y + 1
      }
      if (flag) {
        true
      }
      else {
        false
      }
    }
  }

  def filterPrime(newArray: Array[Int]): Array[Int] = {
    newArray.filter(isPrime)
  }
}
