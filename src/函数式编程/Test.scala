package 函数式编程

/**
  * Author: dyh
  * Date:   2019/1/7
  * Description: 
  */
object Test {
  def a(name:String): Unit ={
    println(name)
  }

  def main(args: Array[String]): Unit = {
    val b=a _
    b("hello")
    // Scala中，函数也可以不需要命名，此时函数被称为匿名函数。// 可以直接定义函数之后，将函数赋值给某个变量；也可以将直接定义的匿名函数传入其他函数之中
    // Scala定义匿名函数的语法规则就是，(参数名: 参数类型) => 函数体
    val sayhello=(name:String)=>println("hello"+name)
    sayhello("jack")
    def greet(func:(String)=>Unit,name: String): Unit ={
      func(name)
    }
    greet(sayhello,"lello")

    val ints = Array(1, 2, 3, 4, 5).map((num: Int) => num * num)
    for(e<-ints){
      println(e)
    }

    def getGreetingFunc(msg: String) = (name: String) => println(msg + ", " + name)
    val greetingFunc = getGreetingFunc("hello")
    greetingFunc("leo")


//    def greeting(func: (String) => Unit, name: String) { func(name) }
//    greeting((name: String) => println("Hello, " + name), "leo")
//    greeting((name) => println("Hello, " + name), "leo")
//    greeting(name => println("Hello, " + name), "leo")

    def triple(func: (Int) => Int) = { func(4) }
    println(triple(4 * _))

  }
}
