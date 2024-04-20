object divisible_by_3and5 {
  def main(args:Array[String]): Unit = {
    val num=15
    if (num%3==0 && num%5==0){
      print("The given number is divisible by 3,5")
    }
    else {
      print("The given number is not divisible by 3,5")
    }
  }
}

