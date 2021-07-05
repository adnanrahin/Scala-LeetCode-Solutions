package leetcode.functional.programming

object KthLargestElementInAnArray {

  def main(args: Array[String]): Unit = {

  }

  class Solution {
    def findKthLargest(nums: Array[Int], k: Int): Int = {
      val kThElement = nums.sorted
      kThElement(nums.length - k)
    }
  }

}
