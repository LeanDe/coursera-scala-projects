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
      return 1
    } else {
      return pascal(c, (r - 1)) + pascal((c - 1), (r - 1))
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def new_balance(count: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        return (count == 0);
      }

      if (chars.head == '(') {
        return (new_balance(count + 1, chars.tail));
      }

      if (chars.head == ')') {
        if (count == 0) {
          return false;
        } else {
          return (new_balance(count - 1, chars.tail));
        }
      }

      return (new_balance(count, chars.tail));
    }

    return new_balance(0, chars);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) {
      return 1;
    } else if (money < 0 || coins.isEmpty) {
      return 0;
    } else if (money <= 0 && !coins.isEmpty) {
      return 0;
    } else {
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }

}
