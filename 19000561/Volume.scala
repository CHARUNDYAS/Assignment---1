object Volume extends App{
  val pi:Double = 3.141592653589793238;
  
  def div(x:Double, y:Double) = x/y;
  def sphere(r:Int) = div(4,3)*pi*r*r*r;

  println(sphere(5));
}
