package loops

object while_loop_sum {
  def main(args:Array[String]):Unit={

    println("enter the range")
    var a =scala.io.StdIn.readInt()
    var sum = 0

    var start = 1

    while (start<a){
      sum +=start
      start +=1
    }
    print("Sum of range is =" + sum)
  }

}
