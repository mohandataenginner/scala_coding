import org.apache.commons.lang3.text.translate.NumericEntityEscaper

object eligibility_membership_discount {
  def main(args:Array[String]): Unit = {
    val purchase_amount = 300
    val loyalty_card = "yes"

    if (purchase_amount>200 || loyalty_card==true){
      print("This user is eligible for Discount and Memebership Benifts" )
    }
    else{
      print("This users is not eligible Discount and membership Benifts")
    }
  }

}
