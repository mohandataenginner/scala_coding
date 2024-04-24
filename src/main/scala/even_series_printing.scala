object even_series_printing {

  def main(args:Array[String]):Unit={

    for (i<-1 to 35){
      if (i%2==0){
        print("even"+",")
      }
      else {
        print(i+",")
      }
    }



  }

}
