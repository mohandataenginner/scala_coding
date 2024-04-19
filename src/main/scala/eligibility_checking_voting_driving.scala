object eligibility_checking_voting_driving {

  def main(args:Array[String]): Unit = {
    val age=20
    if(age>=18){
      print("This user is eligible to vote")
    }
    else if(age>=16){
      print("This is user is eligible for Driving ")
    }
    else{
      print("This is user not eligible to vote either driving")
    }
  }

}
