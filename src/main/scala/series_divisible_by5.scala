object series_divisible_by5 {

  def main(args:Array[String]):Unit={
    for (i<-1 to 25 by 2){
      if(i%5==0){
        print("Divisible by five"+",")
      }
      else {
        print(i+",")
      }
    }
  }

}
