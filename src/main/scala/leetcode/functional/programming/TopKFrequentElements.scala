package leetcode.functional.programming

import scala.collection.immutable.ListMap

object TopKFrequentElements {

  def main(args: Array[String]): Unit = {

  }

  class Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
      val map = nums.groupBy(identity).mapValues(_.map(_ => 1).sum)
      ListMap(map.toSeq.sortWith(_._2 < _._2): _*).keySet.toList.takeRight(k).toArray
    }
  }

}
