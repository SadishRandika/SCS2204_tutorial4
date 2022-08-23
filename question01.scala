object question01 extends App{
  import scala.io.StdIn.readInt

    println("Enter deposit value: ")
    var dep_value =readInt()

  def interest(dep_Value: Int): Double = dep_Value match {
    case x if (x > 0 && x <= 20000) => x * 0.02;
    case x if x <= 200000 => x * 0.04;
    case x if x <= 2000000 => x * 0.035;
    case x if x > 2000000 => x * 0.065;
  }

  printf("Total earn interest value : Rs.%.2f",interest(dep_value));
}
