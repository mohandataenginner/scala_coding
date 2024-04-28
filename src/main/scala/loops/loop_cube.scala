package loops

object loop_cube {

  def main(args:Array[String]):Unit={

    var start = 1
    var end = 3
    var sum =0

    while (start <= end ){
      sum = start * start * start
      start +=1
    }
     println("Sum of cube  is =",sum)
  }

}
