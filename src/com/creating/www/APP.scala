package com.creating.www
import com.creating.www.bean.A
import com.creating.www.bean.extend
object APP {
  def main(args:Array[String]):Unit={
    println("hehe")
    var a=new A
    a.x=199
    a.y=199
    println (a.x,a.y) 
    new extend().operate1
    println(new extend().operate2)
  }
}