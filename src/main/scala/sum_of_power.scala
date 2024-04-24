object sum_of_power {

  def main(args:Array[String]):Unit={

    var sum = 0
    var result = 0

    for (i<- 5 to 100){
      result = i*i
      sum +=result
    }
    print(sum)

  }

}
