package com.creating.www.tuples

object Test001 extends App {
  val tup=(1,2,3)
  println(tup._1,tup._2,tup._3)
  val lst=List((1,2,3),(4,5,6),(7,8,9))
  for((x,y,z)<-lst){
    println(x,y,z)
  }
  lst.foreach{
    case (1,x,y)=>println(1,x,y)
    case _=>print("不匹配")
    
  }
}