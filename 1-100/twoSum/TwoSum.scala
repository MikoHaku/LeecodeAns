object TwoSum {
  def main(args: Array[String]): Unit = {
    val nums = Array[Int](3,3)
    val target = 6
    twoSum(nums, target).foreach(println)
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var mp = scala.collection.mutable.Map[Int, Int]()
    for ((value, key) <- nums.zipWithIndex) {
      mp.get(target - value) match {
        case Some(x) => return (Array(x, key))
        case None => mp += (value -> key)
      }
    }
    Array(0, 0)
  }
}


