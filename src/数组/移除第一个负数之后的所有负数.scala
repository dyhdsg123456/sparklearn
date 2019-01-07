package 数组

import scala.collection.mutable.ArrayBuffer

/**
  * Auther: dyh
  * Date: 2019/1/5 14:05
  * Description: 
  */
object 移除第一个负数之后的所有负数 {


  def main(args: Array[String]): Unit = {
    val a = ArrayBuffer[Int]()
    a += (1, 2, 3, 4, 5, -1, -3, -5, -9)
    var foundFirstNegative = false
    val keepIndexes = for (i <- 0 until a.length if !foundFirstNegative || a(i) >= 0) yield {
      if (a(i) < 0) foundFirstNegative = true
      i
    }
    for (i <- 0 until keepIndexes.length) { a(i) = a(keepIndexes(i)) }
    a.trimEnd(a.length - keepIndexes.length)

    for(e<-a)
    println(e)
  }
}
