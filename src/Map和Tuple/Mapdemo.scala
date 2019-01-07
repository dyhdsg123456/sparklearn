package Map和Tuple

import scala.collection.mutable

/**
  * Auther: dyh
  * Date: 2019/1/5 14:42
  * Description: 
  */
object Mapdemo {
  def main(args: Array[String]): Unit = {
    val ages = Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
    val leoAge = ages("Leo")

//    val leoAge2 = ages("Leo1")
    // 使用contains函数检查key是否存在
    val leoAge3 = if (ages.contains("leo")) ages("leo") else 0

    // getOrElse函数
    val leoAge4 = ages.getOrElse("leo", 0)

    // 创建一个可变的Map
    val ages2 = scala.collection.mutable.Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)

    // 使用另外一种方式定义Map元素
    val ages3 = Map(("Leo", 30), ("Jen", 25), ("Jack", 23))
    // 创建一个空的HashMap
    val ages4 = new scala.collection.mutable.HashMap[String, Int]
    val agess = scala.collection.immutable.SortedMap("leo" -> 30, "alice" -> 15, "jen" -> 25)
    for(e<-agess)println(e)
    val agesf = new mutable.LinkedHashMap[String, Int]
    agesf("leo") = 30
    agesf("alice") = 15
    agesf("jen") = 25
    for(e<-agesf)println(e)

  }
}
