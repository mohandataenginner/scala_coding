object studen_discount_freetrai {

  def main(args:Array[String]):Unit={
    val  age = 22
    val free_trail ="yes"
    if (age<25 || free_trail==true){
      print("Given user is Eligible for student discount or free trail")
    }
    else{
      print("Given user is NOT Eligible for student discount or free trail")
    }
  }

}
