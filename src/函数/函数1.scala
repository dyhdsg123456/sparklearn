package 函数

object 函数1 {
  def sayhello(name: String)=println("hello,"+name);
  def sum(n:Int)={
    var sum=0
    for(i<-1 to n)sum+=i
    sum
  }
  def fab(n: Int): Int = {
    if(n <= 1) 1
    else fab(n - 1) + fab(n - 2)
  }

  def main(args: Array[String]): Unit = {
    print(fab(10))
  }
}
