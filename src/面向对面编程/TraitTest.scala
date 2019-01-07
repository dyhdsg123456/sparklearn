package 面向对面编程

/**
  * Author: dyh
  * Date: 2019/1/7
  * Description:
  */
object TraitTest {
  trait HelloTrait{
    def sayhello(name:String)
  }
  trait MakeFriendsTrait {
    def makeFriends(p: Person)
  }
  class  Person(val name:String)extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable
  {
    def sayhello(name: String)=println("hello"+name)

     def makeFriends(p: Person) = println("Hello, my name is " + name + ", your name is " + p.name)

  }

  def main(args: Array[String]): Unit = {
    val person = new Person("jack")
    val person2 = new Person("lili")

    person.makeFriends(person2)
  }
}
