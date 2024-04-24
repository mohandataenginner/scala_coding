object print_reminder {

  def main(args:Array[String]):Unit={

    println("The enter the number")
    val num = scala.io.StdIn.readInt()

    println("The user entered number is ="+num)

    if (num>100 && num>1000){
      println(" The number is not in range")
    }
    else if (num%2==0){
      println("The number is even and reminder is = " + num%3)
    }
    else if (num%2!=0){
      println("The number is ODD and the reminder is ="+ num%2)
    }
    else {
      print("No valid number")
    }
  }

}
