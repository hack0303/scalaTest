package com.creating.www.multiple.params

object Test001 extends App {
  trait haha{
  def func[A](z:A)(op:(A,Int)=>A):A
  }
  val lst=List(1,2,3,4,5)
  println(lst.foldLeft(0)((m,n)=>m+n))
}