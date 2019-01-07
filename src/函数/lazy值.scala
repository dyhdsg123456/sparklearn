package 函数

import scala.io.Source._

/**
  * 在Scala中，提供了lazy值的特性，也就是说，如果将一个变量声明为lazy，
  * 则只有在第一次使用该变量时，变量对应的表达式才会发生计算。这种特性对于特别耗时的计算操作特别有用，
  * 比如打开文件进行IO，进行网络IO等。
  */
object lazy值 {
    def main(args: Array[String]): Unit = {
    lazy val lines = fromFile("C://Users//Administrator//Desktop//test.txt").mkString
    print(lines)
  }
}
