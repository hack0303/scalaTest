package com.creating.www.COMPREHENSIONS

object Test2 extends App {
  case class A(name:String,age:Int)
  val lst=List(A("a",1),A("b",2),A("c",3),A("d",4))
  val lst2=for(x <- lst if x.age<=3) yield x.name
  for(x<-lst2)
    println(s"A的姓名是 $x")
}