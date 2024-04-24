object pattern_printing {

  def main(args:Array[String]):Unit={

    var a=2
    var b=2

    while (a<16 && b<17){
      print(a+"*"+b+",")
      a +=1
      b +=1
    }
  }
}