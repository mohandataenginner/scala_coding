package loops

object Loop_factroila {

  def main(args:Array[String]):Unit={

//8)Calculate the factorial of a given number using a "for" loop.
   println("Enter number to find the factorial ")
    var a=scala.io.StdIn.readInt()

    var sum = 1

    while (a>1){
      sum *=a
      a -=1
    }
    println("The  factorial  of given number i "+sum)
  }





}
