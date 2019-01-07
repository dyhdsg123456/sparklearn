package 数组

import scala.collection.mutable.ArrayBuffer

/**
  * Auther: dyh
  * Date: 2019/1/5 13:24
  * Description: 
  */
object ArrayBuffer1 {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer[Int]()
    buffer+=1
    buffer+=2
    buffer++= Array(3,4,5)
    // 使用trimEnd()函数，可以从尾部截断指定个数的元素
    buffer.trimEnd(1)
    // 使用insert()函数可以在指定位置插入元素
    // 但是这种操作效率很低，因为需要移动指定位置后的所有元素
//    buffer.insert(1, 6)//插入一个
    buffer.insert(1, 6,7)//插入多个
    // 使用remove()函数可以移除指定位置的元素
//    buffer.remove(1)
    buffer.remove(1, 3)
    // Array与ArrayBuffer可以互相进行转换
//    b.toArray
//    a.toBuffer

    print(buffer)
  }
}
