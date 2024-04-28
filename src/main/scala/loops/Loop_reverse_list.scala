package loops

object Loop_reverse_list {

  def main(args:Array[String]):Unit={


    var list = List(1,2,3,4,5)



    var index = list.length
    while (index>0){
      println(index)
      index -=1
    }

  }



}
