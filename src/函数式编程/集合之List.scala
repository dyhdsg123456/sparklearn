package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: // List代表一个不可变的列表
// List的创建，val list = List(1, 2, 3, 4)
// List有head和tail，head代表List的第一个元素，tail代表第一个元素之后的所有元素，list.head，list.tail
// List有特殊的::操作符，可以用于将head和tail合并成一个List，0 :: list
// 如果一个List只有一个元素，那么它的head就是这个元素，它的tail是Nil
  */
object 集合之List {
    def main(args: Array[String]): Unit = {
      val list = List(1, 2, 3, 4)
      val ints = 0::list
//      for(e<-ints)println(e)
      method(list,"asd")
      for(e<-ints)println(e)
  }
  // 案例：用递归函数来给List中每个元素都加上指定前缀，并打印加上前缀的元素
  def method(l:List[Int],prefix:String): Unit ={
//    Nil是一个空的List
    if(l!=Nil){
      println(prefix + l.head)
      method(l.tail, prefix)
    }
  }
}
