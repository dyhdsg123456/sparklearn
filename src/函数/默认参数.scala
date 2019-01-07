package 函数

object 默认参数 {
  def sayHello(name:String,name2:String="1",name3:String="2")=name+" "+name2+" "+name3
  def main(args: Array[String]): Unit = {
    print(sayHello("123","23"))
  }
}
