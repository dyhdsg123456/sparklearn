package Map和Tuple

/**
  * Auther: dyh
  * Date: 2019/1/5 15:11
  * Description: 
  */
object Tuple {
  def main(args: Array[String]): Unit = {
    val t = ("leo", 30)
    println(t._1)
    println(t._2)
    // zip操作
    val names = Array("leo", "jack", "mike")
    val ages = Array(30, 24, 26)
    val nameAges = names.zip(ages)
    for ((name, age) <- nameAges) println(name + ": " + age)

  }
}
