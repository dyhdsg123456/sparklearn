package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: 
  */
object SetTest {
  // Set代表一个没有重复元素的集合
  // 将重复元素加入Set是没有用的，比如val s = Set(1, 2, 3); s + 1; s + 4
  // 而且Set是不保证插入顺序的，也就是说，Set中的元素是乱序的，val s = new scala.collection.mutable.HashSet[Int](); s += 1; s += 2; s += 5

  // LinkedHashSet会用一个链表维护插入顺序，val s = new scala.collection.mutable.LinkedHashSet[Int](); i += 1; s += 2; s += 5

  // SrotedSet会自动根据key来进行排序，val s = scala.collection.mutable.SortedSet("orange", "apple", "banana")
  def main(args: Array[String]): Unit = {
    val  s=Set(1,2)
    for(e<-s)println(e)
  }
}
