object eligibility_descount_and_freeshipping {

  def main(args:Array[String]):Unit={

    val purchase_amount = 120

    if (purchase_amount>100 && purchase_amount>150) {
      print("The customer is eligible for both discount and free shipping")
    }
    else if (purchase_amount>100) {
      print("Customer is  eligible for free shipping")
    }
    else {
      print("The customer is not eligible for both discount and free shipping")
    }
  }

}
