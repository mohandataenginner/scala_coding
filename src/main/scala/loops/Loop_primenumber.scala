package loops

object Loop_primenumber {

  def main(args:Array[String]):Unit={

    //10)Check if a number is prime using a "while" loop.

    println("Enter a number to check prime number or not =")
    val a = scala.io.StdIn.readInt()

    var count = 0
    for (i<-1 to a){
      if (i%2==0){
        count +=1
      }
    }
    if(count>=2){
      print("This is prime number")
    }
    else {
      print("Not a prime number")
    }
  }





}
