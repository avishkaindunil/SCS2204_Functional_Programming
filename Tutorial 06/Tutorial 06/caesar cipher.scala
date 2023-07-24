import scala.io.StdIn

object CaesarCipher {
  def encrypt(text: String): String = {
    def encryptChar(ch: Char): Char = {
      if (ch.isLetter) {
        val base = if (ch.isUpper) 'A' else 'a'
        ((ch - base + 1) % 26 + base).toChar
      } else {
        ch
      }
    }

    if (text.isEmpty)
      ""
    else
      encryptChar(text.head) + encrypt(text.tail)
  }

  def decrypt(text:String):String={
    def decryptChar(ch:Char):Char={
      if (ch.isLetter) {
        val base = if (ch.isUpper) 'A' else 'a'
        ((ch - base - 1) % 26 + base).toChar
      } else {
        ch
      }
    }
    if (text.isEmpty)
      ""
    else
      decryptChar(text.head) + decrypt(text.tail)
  }


  def main(args: Array[String]): Unit = {
    val text = StdIn.readLine("Enter text: ")
    println("Text : " + text)
    println("Encripted: " + encrypt(text))
    println("Decripted: " + decrypt(encrypt(text)))

  }
}