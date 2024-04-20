object nonpositive_evenumber {

  def main(args:Array[String]): Unit = {
    val a=(-6)
    if (a<0 || a%2==0)
    {
      print("The given number is not positive and is even")
    }
    else{
      print("The give number is positive number amd even")
    }
    print(a%2)
  }

}
