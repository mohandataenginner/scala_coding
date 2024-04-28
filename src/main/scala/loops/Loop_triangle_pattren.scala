package loops

object Loop_triangle_pattren {

  def main(args:Array[String]):Unit={

     for (i<- 1 to 4){
       for (j <- 1 to i){
         print(i+" ")
       }
       println()
     }


  }

}
