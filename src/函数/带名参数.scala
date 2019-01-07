package 函数

object 带名参数 {
  def sayHello(firstName:String = "Mick", lastName:String = "Nina", middleName:String = "Jack")=firstName+" "+lastName+" "+middleName

  def main(args: Array[String]): Unit = {
    print(sayHello("Mick", middleName = "Nina", lastName = "Jack"))//未命名参数必须排在带名参数前面。

  }
}
