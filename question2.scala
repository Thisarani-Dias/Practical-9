package q2

object question2 {

  def determineinput: Int => String = input => input match {
    case i if i<=0 => "Negative/Zero is given"
    case i if i%2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }


  def main(args:Array[String]):Unit = {
    println("Enter integer: ")

    val input = scala.io.StdIn.readLine().toInt
    val output = determineinput(input)

    println(output)
  }

}
