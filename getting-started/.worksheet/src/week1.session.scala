package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(45); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(327); 

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e20);System.out.println("""res3: Double = """ + $show(res$3));$skip(168); 
  
  def factorial(x: Int): Int =
  {
    def fac(cur : Int, back : => Int): Int =
      if(cur == 0) back
      else fac(cur - 1, back * cur)
      
    fac(x, 1)
  };System.out.println("""factorial: (x: Int)Int""");$skip(6); val res$4 = 
    1;System.out.println("""res4: Int(1) = """ + $show(res$4));$skip(20); val res$5 = 
    
  factorial(0);System.out.println("""res5: Int = """ + $show(res$5));$skip(15); val res$6 = 
  factorial(1);System.out.println("""res6: Int = """ + $show(res$6));$skip(15); val res$7 = 
  factorial(2);System.out.println("""res7: Int = """ + $show(res$7));$skip(15); val res$8 = 
  factorial(3);System.out.println("""res8: Int = """ + $show(res$8));$skip(15); val res$9 = 
  factorial(4);System.out.println("""res9: Int = """ + $show(res$9));$skip(15); val res$10 = 
  factorial(5);System.out.println("""res10: Int = """ + $show(res$10));$skip(15); val res$11 = 
  factorial(6);System.out.println("""res11: Int = """ + $show(res$11));$skip(15); val res$12 = 
  factorial(7);System.out.println("""res12: Int = """ + $show(res$12));$skip(15); val res$13 = 
  factorial(8);System.out.println("""res13: Int = """ + $show(res$13));$skip(15); val res$14 = 
  factorial(9);System.out.println("""res14: Int = """ + $show(res$14));$skip(16); val res$15 = 
  factorial(10);System.out.println("""res15: Int = """ + $show(res$15))}
  
}
