package leetcode.functional.programming

object ReverseWordsInString {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()
    println(solution.reverseWords("a good   example"))

  }

  class Solution {
    def reverseWords(s: String): String = {
      s.split("\\s+").reverse.mkString(" ").trim
    }
  }

}
