package 面向对面编程

/**
  * Author: dyh
  * Date: 2019/1/7
  * Description:// Scala中的Triat是一种特殊的概念
// 首先我们可以将Trait作为接口来使用，此时的Triat就与Java中的接口非常类似
// 在triat中可以定义抽象方法，就与抽象类中的抽象方法一样，只要不给出方法的具体实现即可
// 类可以使用extends关键字继承trait，注意，这里不是implement，而是extends，在scala中没有implement的概念，无论继承类还是trait，统一都是extends
// 类继承trait后，必须实现其中的抽象方法，实现时不需要使用override关键字
// scala不支持对类进行多继承，但是支持多重继承trait，使用with关键字即可
  */
object Trait作为借口 {
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
