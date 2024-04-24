object temperature_converter {

  def main(args:Array[String]):Unit={

    println("Enter the temperature in celsius")

    val tem_cel = scala.io.StdIn.readInt()
    val tem_f = (tem_cel*9/5)+32

    println("temperature in celsius =  " + tem_cel + "C")
    println("temperature in fahrenheit =  " + tem_f +"F")

  }
}
