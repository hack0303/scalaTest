package com.creating.www.wit.mixins

object MixinsTest extends App {
  abstract class A{
    val a='a'
    def toSay():Unit
  }
  trait B extends A{
    val b='b'
    def toSay():Unit
    def bSay():Unit=println("i'm b,not c")
  }
  class C(str:String) extends A{
  override  def toSay():Unit=println(str)
  }
  class D(str:String) extends C("hehe") with B{
  override  def toSay():Unit=println(str)
  }
  var o=new D("d")
  o.bSay()
  //<== 抽象实现可以实时的更换为抽象实现下的接口子类。
  abstract class Ab{
    type T
    def say():T
  }
  class InstanceAb_int extends Ab{
    type T=Int
    override def say()={
      111
    }
  }
  class InstanceAb_string extends Ab{
    type T=String
     override def say()={
      "string"
    }
  }
  println(new InstanceAb_int().say(),new InstanceAb_string().say())
  //<== 相当于JAVA中的模板方法
  /*?疑问的，之后补起来
   * trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}?*/
  
  
}