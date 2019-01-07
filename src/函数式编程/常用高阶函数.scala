package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: 
  */
object 常用高阶函数 {
  def main(args: Array[String]): Unit = {
    val ints = Array(1,2,3).map(3*_)
//    for(e<-ints)println(e)
    // foreach: 对传入的每个元素都进行处理，但是没有返回值
    (1 to 9).map("2"*_).foreach(println _)

    // filter: 对传入的每个元素都进行条件判断，如果对元素返回true，则保留该元素，否则过滤掉该元素
    val ints1 = (1 to 20).filter(_ % 2 == 0)
//    for(e<-ints1)println(e)

    // reduceLeft: 从左侧元素开始，进行reduce操作，即先对元素1和元素2进行处理，然后将结果与元素3处理，再将结果与元素4处理，依次类推，即为reduce；reduce操作必须掌握！spark编程的重点！！！
    // 下面这个操作就相当于1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
    println((1 to 9).reduceLeft( _ * _))
    println((2 to 4).reduceLeft(_+_))

    // sortWith: 对元素进行两两相比，进行排序
    val ints2 = Array(3, 2, 5, 4, 10, 1).sortWith(_ < _)
    for(e<-ints2)println(e)
  }
}
