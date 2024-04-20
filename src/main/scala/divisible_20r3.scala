object divisible_20r3 {
  def main(args:Array[String]):Unit={
    val number= 9

    if (number%20==0 || number%3==0){
      print("The given number is divisible by either 2 or 3")
    }
    else {
      print("The given number is not divisible by either 2 or 3")
    }
  }

}
