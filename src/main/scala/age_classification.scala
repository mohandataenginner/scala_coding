object age_classification {
  def main(args:Array[String]):Unit={

    val age =15

    if (age<13){
      print("The person is Child")
    }
    else if (age>=13 || age>=19){
      print("The person is Teenager")
    }
    else{
      print("The person is adult")
    }
  }

}
