package q3

object question3 {

  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input:String): String = {
    input.toLowerCase
  }

  def formatNames(name:String)(formatfunction:String => String): String = {
    formatfunction(name)
  }

  def main(args:Array[String]): Unit = {

    println(formatNames("benny")(toUpper))
    println(formatNames("niroSHAN")(name => toUpper(name.substring(0, 2)) + toLower(name.substring(2))))
    println(formatNames("SAMAN")(toLower))
    println(formatNames("kuMAra")(name => toUpper(name.substring(0,1))+ toLower(name.substring(1,name.length-1)) + toUpper(name.substring(name.length-1))))
  }

}
