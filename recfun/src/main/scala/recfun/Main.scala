package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    {
      if (c == 0 || c == r) 1
      else pascal(c, r - 1) + pascal(c - 1, r - 1)
    }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    {
      def balance(remain: List[Char], depthLeft: Int): Boolean =
        {
          if (remain.isEmpty) depthLeft == 0
          else if (remain.head != '(' && remain.head != ')') balance(remain.tail, depthLeft)
          else if (remain.head == '(') balance(remain.tail, depthLeft + 1)
          else if (depthLeft == 0) false else balance(remain.tail, depthLeft - 1)
        }
      balance(chars, 0)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    {
      if (coins.isEmpty) 0
      else countChange(money, coins.tail) +
        {
          if (money == coins.head) 1
          else if (coins.head < money) countChange(money - coins.head, coins)
          else 0
        }
    }

}
