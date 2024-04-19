object oddnumber_not_divisable_by_three {

  def main(args:Array[String]):Unit={

    val a = 27

    if (a%2!=0 && a%3 !=3){
      print("a is ODD number and not divisable by 3")
    }
    else{
      print("its not a odd number and divisable by 3")
    }
  }

}
