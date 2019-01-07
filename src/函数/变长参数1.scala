package 函数

object 变长参数1 {
  def sum(nums:Int*)={
    var res=0
    for (num<-nums)
      res+=num
    println(res)
  }
  def sum2(nums:Int*):Int={
    if(nums.length==0){
      0
    }else{
      nums.head+sum2(nums.tail:_*)
    }
  }
  def main(args: Array[String]): Unit = {
//    sum(1,2,3,4)
//    使用序列调用变长参数
    sum(1 to 4:_*)//1,2,3,4
    print(sum2(1 to 4:_*))//1,2,3,4
  }
}
