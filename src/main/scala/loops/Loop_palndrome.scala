package loops

object Loop_palndrome {

  def main(args:Array[String]):Unit={

    //13)Check if a string is a palindrome using a "for" loop.

    var a = 11
    var b = a

    var rem = 0
    var rev = 0

    while ( a!=0) {
      rem = a%10
      rev = rev*10+rem
      a = a/10
    }
    if(rev ==b){
      println("NUmber is Palindrome")
    }
    else{
      print("Not a palindrome")
    }

  }

}
