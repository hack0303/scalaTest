package com.creating.www.caze.clazz

/**
 * 
 * */
object CaseClassTest extends App {
  case class A(a:String,b:String,c:String){
    override def toString():String={
      s"${a},${b},${c}"
    }
  }
  val a=A("a","b","c")
  val b=a.copy(a=a.a,b="x")
  println(a,b)
}