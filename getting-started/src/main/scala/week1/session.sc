package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(4)                                         //> res1: Double = 2.0000000929222947
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(1e20)                                      //> res3: Double = 1.0000021484861237E10
  
  def factorial(x: Int): Int =
  {
    def fac(cur : Int, back : => Int): Int =
      if(cur == 0) back
      else fac(cur - 1, back * cur)
      
    fac(x, 1)
  }                                               //> factorial: (x: Int)Int
    1                                             //> res4: Int(1) = 1
    
  factorial(0)                                    //> res5: Int = 1
  factorial(1)                                    //> res6: Int = 1
  factorial(2)                                    //> res7: Int = 2
  factorial(3)                                    //> res8: Int = 6
  factorial(4)                                    //> res9: Int = 24
  factorial(5)                                    //> res10: Int = 120
  factorial(6)                                    //> res11: Int = 720
  factorial(7)                                    //> res12: Int = 5040
  factorial(8)                                    //> res13: Int = 40320
  factorial(9)                                    //> res14: Int = 362880
  factorial(10)                                   //> res15: Int = 3628800
  
}