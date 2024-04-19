object check_discount_eliginvility {

  def main(args: Array[String]): Unit = {
    val age = 63
    if (age < 25) {
      print("This Discount is for student")
    }
    else if (age > 60) {
      print("This Discount is for Seniors")
    }
    else {
      print("There is no discount")
    }
  }
}
