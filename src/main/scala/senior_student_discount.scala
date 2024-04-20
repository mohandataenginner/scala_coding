object senior_student_discount {
  def main(args:Array[String]): Unit = {
    val age = 70

    if (age<25){
      print("This user is eligible for Student Discount")
    }
    else if (age>60){
      print("This user is eligible for Senior Discount")
    }
    else {
      print("No discount")
    }
  }

}
