package 数组

import scala.collection.mutable.ArrayBuffer

/**
  * Auther: dyh
  * Date: 2019/1/5 13:40
  * Description: 
  */
object 遍历数组 {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]()
    b+=1
    b+=2
    b++= Array(3,4,5,6,7)
    for (i<-0 until b.length)
      println(b(i))
    // 跳跃遍历Array / ArrayBuffer
    for(i <- 0 until (b.length, 2))
      println(b(i))
    // 从尾部遍历Array / ArrayBuffer
    for(i <- (0 until b.length).reverse)
      println(b(i))
    // 使用“增强for循环”遍历Array / ArrayBuffer
    for (e <- b)
      println(e)

  }
}
