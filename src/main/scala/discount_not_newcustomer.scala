object discount_not_newcustomer {
  def main(args:Array[String]):Unit={

    val age = 70
    val new_customer = false
    if (age>65 && new_customer==false){
      print("The customer is eligible for Discount")
    }
    else{
      print("The customer is not eligible for Discount")
    }

  }

}
