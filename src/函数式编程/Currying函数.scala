package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: // Curring函数，指的是，将原来接收两个参数的一个函数，转换为两个函数，第一个函数接收原先的第一个参数，然后返回接收原先第二个参数的第二个函数。
// 在函数调用的过程中，就变为了两个函数连续调用的形式
  */
object Currying函数 {
  def main(args: Array[String]): Unit = {
    def sum(a:Int,b:Int):Int={
      a+b
    }
    def sum2(a: Int) = (b: Int) => println(a + b)
    sum2(1)(3)

    def sum3(a: Int)(b: Int) =print(a + b)
    sum3(3)(3)
  }
}
