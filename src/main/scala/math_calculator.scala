object math_calculator {
  def main(args:Array[String]):Unit={

    println("Enter the first number")
    val a=scala.io.StdIn.readInt()

    println("Enter the second number")
    val b=scala.io.StdIn.readInt()

    println("Enter type of operation +,_,/,*")
    val operation = scala.io.StdIn.readLine()

    println("First numbe1r is = " + a)
    println("second number is =  " + b)

    if (operation== "+"){
      print("Sum of two number is = "+  (a+b))
    }
    else if (operation=="-"){
      print("Sub of two number is = "+  (a-b))
    }
    else if (operation=="/"){
      print("div of two number is = "+  (a/b))
    }
    else if (operation=="*"){
      print("div of two number is = "+  (a*b))
    }
    else{
      print("invalid operation")
    }
  }
}
