package leetcode.functional.programming

object LongestCommonPrefix {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()

    println(solution.longestCommonPrefix(Array("flower", "flow", "flight")))

  }

  class Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
      if (strs.length == 0) ""
      else strs.head.zipWithIndex.takeWhile(r => strs.forall(s => r._2 < s.length && s(r._2) == r._1)).map(_._1).mkString
    }
  }

}
