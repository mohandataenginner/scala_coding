object range_divisible_by_11 {

  def main(args:Array[String]):Unit={

    for (x<- 250 to 550){
      if (x%11==0){
        println( x)
      }
    }
  }

}
