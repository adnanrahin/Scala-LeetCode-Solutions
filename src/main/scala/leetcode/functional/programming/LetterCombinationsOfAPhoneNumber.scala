package leetcode.functional.programming

object LetterCombinationsOfAPhoneNumber {

  def main(args: Array[String]): Unit = {

    val solution = new Solution
    println(solution.letterCombinations("23"))
  }

  class Solution {

    val keypad = Map('2' -> "abc", '3' -> "def", '4' -> "ghi", '5' -> "jkl",
      '6' -> "mno", '7' -> "pqrs", '8' -> "tuv", '9' -> "wxyz")


    def letterCombinations(digits: String): List[String] = {
      if(digits.length == 0) List.empty
      else {
        val res = scala.collection.mutable.ArrayBuffer[String]()
        depthFirstSearch(digits,0,"",res)
        res.toList
      }
    }

    def depthFirstSearch(digits: String, start: Int, str: String, list: scala.collection.mutable.ArrayBuffer[String]): Unit = {

      if (str.length == digits.length) {
        list.append(str)
        return
      }
      val key = keypad(digits.charAt(start))
      var i = 0
      while (i < key.length) {
        depthFirstSearch(digits, start + 1, str + key.charAt(i), list)
        i += 1
      }
    }
  }
}
