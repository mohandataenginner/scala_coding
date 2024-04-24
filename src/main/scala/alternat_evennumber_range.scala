object alternat_evennumber_range {

  def main(args:Array[String]):Unit={

    for (i<-20 to 140 by 6){
      if (i%2==0){
        println(i)
      }
    }
  }

}
