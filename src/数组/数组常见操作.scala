package 数组

/**
  * Auther: dyh
  * Date: 2019/1/5 13:45
  * Description: 
  */
object 数组常见操作 {
  def main(args: Array[String]): Unit = {
    // 数组元素求和
    val a = Array(1, 2, 3, 4, 5)
    val sum = a.sum
    // 获取数组最大值
    val max = a.max
    // 对数组进行排序
    scala.util.Sorting.quickSort(a)
    // 获取数组中所有元素内容
    a.mkString
    a.mkString(", ")
    a.mkString("<", ",", ">")
    // toString函数
    a.toString
  }
}
