import scala.io.StdIn

object PatternMatching{
    def main (args : Array[String]):Unit={
        var num = StdIn.readInt();
        println(patternMatching(num));

    }

    def patternMatching(num:Int):String={
        if (num <= 0)
            "Negative/Zero";
        else if (num%2 == 0)
            "Even";
        else
            "Odd";
    }
}