package loops

object perfect_square_loop {

 def main(args:Array[String]):Unit={

   var a = scala.io.StdIn.readInt()
   var b = a
   var sqr = 1

   while (a<0){
     sqr = sqr*a
     a -=1
   }
   print(sqr)
 }

}
