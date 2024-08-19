package q1

object question1 {

  def interestfunction: Double => Double = deposit => deposit match {
    case d if d<=20000 => d*2/100
    case d if d<=200000 => d*4/100
    case d if d<=2000000 => d*3.5/100
    case d if d>2000000 => d * 6.5 / 100
    
  }

  def main(args:Array[String]):Unit = {
    println("Enter the principle amount: ")

    val principle = scala.io.StdIn.readLine().toDouble

    val interest = interestfunction(principle)
    println(s"Interest is $interest" )
    
  }

}
