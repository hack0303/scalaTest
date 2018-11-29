package com.creating.www.extratormethod

import scala.util.Random

object ExtratorMethod extends App {
  println("------------")
  case class A(name:String){
    def print()=println("hehe")
  }
  A("hehe").print()
  /**
   * 示例跑不通，待解决
   * */
  object Tester{
    def print=println("hehe")
    def apply(name:String):String=s"${name}--${Random.nextLong}"
    def unapply(TesterID:String):Option[String]={
      val objArray:Array[String]=TesterID.split("--")
      println(objArray)
      if(objArray.tail.nonEmpty) Some(objArray.head) else{
        println("is None")
        None
        }
    }
    Tester.print
    println(Tester.apply("hehe"))
    val testid=Tester("aaa")
    testid match{
      case Tester(name) => println(name)
      case _=>println("match is None")
    }
    println(testid)
    val Tester(name)=testid
    println(name)
  }
}