package 函数式编程

import scala.collection.mutable

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: 
  */
object LinkedlistTest {
  def main(args: Array[String]): Unit = {
    // LinkedList代表一个可变的列表，使用elem可以引用其头部，使用next可以引用其尾部
     val l = scala.collection.mutable.LinkedList(1, 2, 3, 4, 5);
//      println(l.elem)
//      println(l.next)
    //使用while循环将linkedlist中每个元素都乘以2
    val list = mutable.LinkedList(1,2,3,4)
    for(e<-list)println(e)
    var curlist=list;
    while (curlist!=Nil){
      curlist.elem=curlist.elem*2
      curlist=curlist.next
    }
    for(e<-list)println(e)
  }
}
