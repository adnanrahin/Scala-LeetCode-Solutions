package leetcode.functional.programming

object KthSmallestElementInASortedMatrix {

  def main(args: Array[String]): Unit = {

    val matrix = Array(Array(1, 5, 9), Array(10, 11, 13), Array(12, 13, 15))
    val flattenMatrix = matrix.flatten
    println(flattenMatrix.mkString("Array(", ", ", ")"))

    val newMatrix = Array(Array(1, 2), Array(1, 3))

    println(newMatrix.flatten.mkString("Array(", ", ", ")"))

  }

  def kthSmallest(matrix: Array[Array[Int]], k: Int): Int = {
    val arr = matrix.flatten.sorted
    arr(arr.length - (arr.length - k))
  }

}
