package leetcode.functional.programming

object LongestSubstringWithoutRepeatingCharacters {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()

    println(solution.lengthOfLongestSubstring("abcabcdef"))
  }

  class Solution {
    def lengthOfLongestSubstring(s: String): Int = {

      s.scanLeft("")(
        (x: String, y: Char) =>
          x.substring(1 + x.indexOf(y)) + y)
        .map(_.length)
        .reduce(Math.max)
    }
  }
}

