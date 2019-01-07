package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: 
  */
object 集合式函数编程 {
  def main(args: Array[String]): Unit = {

    // map案例实战：为List中每个元素都添加一个前缀
//    List("Leo", "Jen", "Peter", "Jack").map("name is " + _)
    val tuples = List("Leo", "Jen", "Peter", "Jack").map((_, 1))

    for(e<-tuples)println(e)
    // faltMap案例实战：将List中的多行句子拆分成单词
    List("Hello World", "You Me").flatMap(_.split(" "))

    // foreach案例实战：打印List中的每个单词
//    List("I", "have", "a", "beautiful", "house").foreach(println(_))

    // zip案例实战：对学生姓名和学生成绩进行关联
    List("Leo", "Jen", "Peter", "Jack").zip(List(100, 90, 75, 83))

  }

}
