object Student_iq {

  def main(args:Array[String]):Unit={
     println("Enter the IQ level")

    val iq=scala.io.StdIn.readInt()

    println("Student IQ is ="+iq)

    if (iq>0 && iq>100){
      println(" Invalid input")
    }
    else if (iq>80 && iq<=90){
      println("The student is Super Smart")
    }
    else if (iq>70 && iq<=80){
      println("The student is Super enough")
    }
    else if (iq>60 && iq<=70){
      println("The student is just smart")
    }
    else if (iq>35 && iq<=60){
      println("The student is no smart")
    }
    else if (iq>0 && iq<=35){
      println("The student is dumb")
    }
    else{
      println("student not exists")
    }
  }

}
