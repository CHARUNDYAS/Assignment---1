object Book extends App{

  def discount(a:Float=24.95f, b:Float=0.4f) = a*b;
  var dis = discount();
  var n = 60;

  if(n>50){
    def first(p:Int=50, s:Float=3f)= p*s;
    var f1 = first();

    def other(n:Int, p:Int=50)=(n-p)*0.75f;
    var f2 = other(n:Int);

    def calc(f1:Float, f2:Float, dis:Float) = f1+f2+dis;

    print("Rs.");
    println(calc(f1:Float, f2:Float,dis:Float));
  }
  else{
    def first1(n:Int, s:Float =3)= n*s;
    var ff1 = first1(n:Int);
    
    def calc1(dis:Float,ff1:Float)=dis+ff1;

    print("Rs.");
    println(calc1(dis:Float, ff1:Float));
  }
}
