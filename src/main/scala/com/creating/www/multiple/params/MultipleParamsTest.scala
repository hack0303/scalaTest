package com.creating.www.multiple.params

object MultipleParamsTest extends App {
  //def left[B](i:B)(op:(B,B)=>B):B
  def list=List(1,2,3,4)
  println(list.foldLeft(0)((m,n)=>m+n))
  println(list.foldRight(0)((m,n)=>m+n))
  println(list.foldLeft(0)(_+_))
  println(list.foldRight(0)(_+_))
  println(list.foldLeft(1)(_+_))
  println(list.foldLeft(0)(_-_))
  println(list.foldRight(0)(_-_))
  //=>自定义和传函数的方式等后面再补全
}