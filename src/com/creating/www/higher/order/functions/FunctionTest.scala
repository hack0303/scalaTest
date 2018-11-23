package com.creating.www.higher.order.functions

object FunctionTest extends App {
  val origin=Seq(111,2222,333)
  val func=(x:Int)=>2*x
  val newSeq=origin.map(func)
  println(newSeq)
  println(origin.map((x)=>2*x))
  println(origin.map(2*_))
  def func(a:String,b:String):(String,String)=>Unit={
    (x:String,y:String)=>{
      println(x,y)
    }
  }
  func("a","b")("a","b")
  
}