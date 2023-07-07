import scala.io.StdIn
object interest {

    def main (args : Array[String]): Unit={
        print("Enter deposit amount: ")
        val d = StdIn.readDouble();
        println(interest(d));
    }

    def interest(deposit:Double):Double ={
        if (deposit <= 20000.00)
            deposit*2/100;
        else if (deposit<=200000)
            deposit*4/100;
        else if (deposit<=2000000)
            deposit*3.5/100;
        else 
            deposit*6.5/100;
    }
}