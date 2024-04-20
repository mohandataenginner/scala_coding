object divisible_2_or_5 {

  def main(args:Array[String]): Unit = {

    val num=25

    if(num%2==0 || num%5==0){
      print("The number is divisible by 2 or 5")
    }
    else{
      print("The number is not divisible by 2 or 5")
    }
  }

}
