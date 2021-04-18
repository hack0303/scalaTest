package com.creating.www.clazz

object CaseClassTest extends App {
  case class A(a:Int,b:Int)
  case class B(a:Int,b:Int)
  val x=A(1,2)
  val y=A(1,2)
  println(x==y)
  val z=x.copy(x.a, 2)
  println(z==x)
sealed trait Me{
    def func
  }
  class M001 extends Me{
   def func:Unit={
      
    }
  }
  class M002 extends Me{
   def func:Unit={
      
    }
  }
  val t=new M002
  t match{
    case m:M001=>{
      println("M001")
    }
    case _ =>{
      println("other")
    }
  }
}