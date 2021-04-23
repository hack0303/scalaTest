package com.creating.www.bean.traits

import scala.collection.mutable.ArrayBuffer
object TraitTest {
  trait A{
    def operator:Boolean
    //def operator():Unit 不可以这样再定义
    def otherOperator():Unit
  }
  class INSTANCE1(name:String) extends A{
    private var count=0
    override def operator=count<10
    override def otherOperator()={
      println(name)
    }
  }
  class INSTANCE2(name:String) extends A{
    private var count=0
    override def operator=count<10
    override def otherOperator()={
      println(name)
    }
  }
  def main(args:Array[String]):Unit={
    println("aa")
    val a1=new INSTANCE1("INSTANCE1")
    val a2=new INSTANCE2("INSTANCE2")
    val as=ArrayBuffer.empty[A]
    as.append(a1)
    as.append(a2)
    as.foreach((e)=>{
      e.otherOperator()
    })
  }
}