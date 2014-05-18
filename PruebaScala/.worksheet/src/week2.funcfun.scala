package week2

object funcfun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(12); val res$0 = 

  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(20); val res$3 = 

  x.sub(y).sub(z);System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(13); val res$4 = 

  y.add(y);System.out.println("""res4: week2.Rational = """ + $show(res$4));$skip(13); val res$5 = 
  
  y add y;System.out.println("""res5: week2.Rational = """ + $show(res$5))}
  
}

class Rational(x: Int, y: Int) {
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def add(that: Rational) =
    new Rational(numer * that.denom +
      that.numer * denom,
      denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom
}
