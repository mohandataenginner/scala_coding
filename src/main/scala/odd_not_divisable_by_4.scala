object odd_not_divisable_by_4 {

  def main(args:Array[String]):Unit={
    val num=15
    if (num%2!=0 && num%4!=0){
      print("The given number is odd and no divisible by 4")
    }
    else {
      print("The given number is not odd and divisible by 4")
    }
  }

}
