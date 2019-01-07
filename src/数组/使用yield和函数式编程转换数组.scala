package 数组

import scala.collection.mutable.ArrayBuffer

/**
  * Auther: dyh
  * Date: 2019/1/5 13:53
  * Description: 
  */
object 使用yield和函数式编程转换数组 {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4, 5)
    val a2 = for (ele <- a) yield ele * ele
//    for(el<-a2) println(el)
    // 对ArrayBuffer进行转换，获取的还是ArrayBuffer
    val b = ArrayBuffer[Int]()
    b += (1, 2, 3, 4, 5)
    val b2 = for (ele <- b) yield ele * ele
    // 结合if守卫，仅转换需要的元素
    val a3 = for (ele <- a if ele % 2 == 0) yield ele * ele
//    for(el<-a3) println(el)
    // 使用函数式编程转换数组（通常使用第一种方式）
    val ints = a.filter(_ % 2 == 0).map(2 * _)
        for(el<-ints) println(el)
    a.filter { _ % 2 == 0 } map { 2 * _ }

  }
}
