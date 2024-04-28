package loops

object loop_03 {

  def main(args:Array[String]):Unit={
    //4)Print the square of numbers from 1 to 5 using a "for" loop.
    var a = 0
    for (i<- 1 to 5){
      a = i*i
      println(a)
    }

  }

}
