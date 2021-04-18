package com.creating.www.nested.method

object Test001 extends App {
  def func(x:Int)={
    def func(x:Int,y:Int):Int={
      if(x<1) y
      else{
        func(x-1,x*y)
      }
    }
    func(x,1)
  }
  println(func(3))
}