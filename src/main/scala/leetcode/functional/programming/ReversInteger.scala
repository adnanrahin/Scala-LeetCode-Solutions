package leetcode.functional.programming

object ReversInteger {

  def main(args: Array[String]): Unit = {

    val solution = new Solution()

    println(solution.reverse(429496729))

  }

  class Solution {
    def reverse(x: Int): Int = {
      val reversString = x.toString.reverse

      /*val solution = reversString match {
        case s if s.endsWith("-") => reversString.substring(0, reversString.length - 2).toInt * -1
        case _ => reversString.toInt
      }*/

      val solution = reversString.charAt(reversString.length - 1) match {
        case '-' => reversString.substring(0, reversString.length - 1).toInt * -1
        case _ => reversString.toInt
      }

      solution
      /*val solution: Int = reversString.charAt(reversString.length - 1) match {
        case '-' => reversString.substring(0, reversString.length - 2).toInt * -1
        case _ => reversString.toInt
      }*/
    }
  }

}
