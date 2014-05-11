package recfun

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
  def pascal(c: Int, r: Int): Int = {
    if (c == r || c == 0) {
      1
    } else {
      pascal(c, (r - 1)) + pascal((c - 1), (r - 1))
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def new_balance(count: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        (count == 0);
      } else if (chars.head == '(') {
        (new_balance(count + 1, chars.tail));
      } else if (chars.head == ')') {
        if (count == 0) {
          false;
        } else {
          (new_balance(count - 1, chars.tail));
        }
      } else {
        (new_balance(count, chars.tail))
      }
    }

    new_balance(0, chars);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) {
      1
    } else if (money < 0 || coins.isEmpty) {
      0
    } else if (money <= 0 && !coins.isEmpty) {
      0
    } else {
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }

}
