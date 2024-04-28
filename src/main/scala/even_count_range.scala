object even_count_range {
  def main(args:Array[String]):Unit={
    println("enter the start range number")
    val start = scala.io.StdIn.readInt()

    println("enter the end range number")
    val end = scala.io.StdIn.readInt()

    var count = 0

    for (i<- start to end ){
      if (i%2==0){
        count +=1
      }
    }
    print(count)

  }




}
