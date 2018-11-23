package com.creating.www.nested.method

object NestedMethodTest extends App {
  def func(v:Int):Int={
    def func(vv:Int,acculator:Int):Int={
      if(vv<=1) acculator
      else{ 
        func(vv-1,vv*acculator)  
      }
    }
    func(v,1)
  }
  println(func(2))
  println(func(3))
  println(func(4))
}