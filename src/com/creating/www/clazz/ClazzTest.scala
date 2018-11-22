package com.creating.www.clazz

import java.math._
object ClazzTest {
  class A(){
    override def toString():String={
      "fff"
    }
  }
  class B(x:Int=0,y:Int=0){
    override def toString():String={
      x+" "+y
    }
  }
  class C(x:Int,y:Int){
    override def toString():String={
      x+" "+y
    }
  }
  class D{
    private var _x:Int=0
    private var _y:Int=0
    def x=this._x
    def y=this._y
    def x_=(x:Int):Unit={
      this._x=x
    }
    def y_=(y:Int):Unit={
      this._y=y
    }
    override def toString():String={
      x+" "+y
    }
  }
  def main(args:Array[String]):Unit={
    println("aaaa")
    val a:A=new A
    val b:B=new B(1)
    val b0:B=new B()
    val b2:B=new B(y=1)
    val c:C=new C(1,2)
    println(a,b,b0,b2,c)
    val d:D=new D
    d.x=10086
    d.y=10087
    println(d)
    //println(Math.sqrt(4))
  }
}