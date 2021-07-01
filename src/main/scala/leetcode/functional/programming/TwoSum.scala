package leetcode.functional.programming

object TwoSum {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()

    println(solution.twoSum(Array(2, 3, 4, 5), 9).mkString("Array(", ", ", ")"))

  }
  class Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {

      val zipIndex = nums.zipWithIndex

      val lookupMap = zipIndex.toMap

      zipIndex
        .collectFirst {
          case (value, index) if lookupMap.get(target - value).exists(_ != index) =>
            Array(index, lookupMap(target - value))
        }.getOrElse(Array())
    }
  }
}

