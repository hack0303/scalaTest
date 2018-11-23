package com.creating.www.pattern.matching

import scala.util.Random
object PatternMatchingTest extends App {
  abstract class Animal
  case class Dog(name:String,age:Int) extends Animal
  case class Pig(name:String,age:Int) extends Animal
  case class Cat(name:String,age:Int) extends Animal
  val x:Int=Random.nextInt(10)
  x match{
    case 0=> println("0")
    case 1=>println("1")
    case _=>println("not 0 not 1")
  }
  def matchTest(param:Int):String={
    param match{
      case 0=>"0"
      case 1=>"1"
      case _=>"not 0 not 1"
    }
  }
  println(matchTest(x))
  //=>�����ǻ����÷�
   //val animal=Dog("����",3)��������Ҫָ������
  val animal:Animal=Dog("����",3)
  animal match{
    case Dog(name,_) if name=="����"=>println(s"����${name}")
    case Pig(name,age) => println("${name},${age}")
    case Cat(_,age) => println("cat,age=${age}")
    case other => println("not right object type")
  }
  val animal02:Animal=Dog("�󹷵�",2)
  animal02 match{
    case a:Dog =>println(s"${a.name}")
    case b:Pig => println("Pig")
    case c:Cat => println("Cat")
    case other => println("not right object type")
  }
  
  
}