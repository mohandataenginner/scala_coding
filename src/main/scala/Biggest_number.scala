object Biggest_number {

  def main(args:Array[String]):Unit={

    println("Enter The first number")
    val x = scala.io.StdIn.readInt()

    println("Enter The second number")
    val y = scala.io.StdIn.readInt()

    println("Enter The Third number")
    val z = scala.io.StdIn.readInt()

    println(" Fist number = " + x)
    println(" Second number = " + y)
    println(" Third number = " + z)


    if (x>y && x>z){
      println(" x is biggest number")
    }
    else if(y>x && y>z){
      println("y is biggest number")
    }
    else{
      println("z is biggest number")
    }

  }

}
