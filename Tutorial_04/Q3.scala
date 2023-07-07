object word{

    def main (args: Array[String]):Unit = {
        println(toUpper("Benny"))
        println(formatNames("Niroshan",1))
        println(toLower("Saman"))
        println(formatNames("Kumara",5))
    }

    def toUpper(word :String):String={
        word.toUpperCase();

    }

    def toLower(word :String):String={
        word.toLowerCase();

    }

    def formatNames(word: String, index: Int): String = {
        val wordChar = word.charAt(index)
        val modified =  wordChar.toUpper
        word.patch(index, modified.toString, 1)
    }
    


}