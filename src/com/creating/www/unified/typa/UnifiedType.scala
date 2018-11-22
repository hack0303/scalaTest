package com.creating.www.unified.typa

//import java.util._
object UnifiedType {
  def main(args:Array[String]):Unit={
    println("hello world")
    val list:List[Any]=List(
    "a string",
    'a',
    111,
    true,
    ()=>"hehehe"
    )
    list.foreach(a=>println(a))
    val x =111
    val y:Double=1.1
    val z:Float=1.2f
    val c:Boolean=true
    var ch:Char='a'
   // var c_value:Int=c 不可以
    var ch_value:Int=ch
   // var toFloat:Float=y 不可以
  }
}