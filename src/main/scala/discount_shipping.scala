object discount_shipping {

  def main(args:Array[String]): Unit = {

    val amount= 160

    if (
      amount>100
        && amount>150) {
      print("Customer i eligible for Discount and Free shipping")
    }
    else if(amount>100
      && amount<150)
    {
      print("Customer i eligible for free shipping")
    }
    else {
      print("Customer is not eligible for Discount or shippng")
    }
  }

}
