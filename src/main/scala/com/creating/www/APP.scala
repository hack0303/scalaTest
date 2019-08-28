package com.creating.www
import com.creating.www.bean.A
import com.creating.www.bean.Extend0
object APP {
  def main(args:Array[String]):Unit={
    println("hehe")
    var a=new A
    a.x=199
    a.y=199
    println (a.x,a.y) 
    val t_obj=new Extend0()
    t_obj.operate1
    println(t_obj.operate2)
    println (1+1)
    println ((1+1).isInstanceOf[Int])
    val v0=()=>"hehe"
    val v1=(x:Int)=>x
    val v2=(x:Int,y:Int)=>x+y
    println(v0())
    println(v0)
    println(v1(1))
    println(v2(1,2))
    def dv0():String={
      "hehe"
    }
    def dv1(x:Int):Int={
      x
    }
    def dv2(x:Int,y:Int):Int={
      x+y
    }
    def dv2_1(x:Int,y:Int)(z:Int):Int={
      (x+y)*z
    }
    println(dv0(),dv1(1),dv2(1,2),dv2_1(1,2)(3))
  }
}