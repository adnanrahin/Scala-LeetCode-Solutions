package leetcode.functional.programming

object GroupAnagrams {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()
    println(solution.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")))
  }

  class Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
      strs.groupBy(_.sorted).map(f => f._2.toList).toList
    }
  }

}
