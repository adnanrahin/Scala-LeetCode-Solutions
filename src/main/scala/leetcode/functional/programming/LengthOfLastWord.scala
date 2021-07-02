package leetcode.functional.programming

object LengthOfLastWord {

  def main(args: Array[String]): Unit = {

  }

  class Solution {
    def lengthOfLastWord(s: String): Int = {
      s.trim.split(" ").last.length
    }
  }
}
