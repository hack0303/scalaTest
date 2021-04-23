package com.creating.www.variances

//https://docs.scala-lang.org/zh-cn/tour/variances.html
/**
  * class Foo[+A] // A covariant class 协变
  * class Bar[-A] // A contravariant class 逆变
  * class Baz[A]  // An invariant class 不变
  * */
object VarianceTest extends App {
  abstract class Animal {
    def name: String
  }
  case class Cat(name: String) extends Animal
  case class Dog(name: String) extends Animal

  val cats=List(Cat("cat-a"),Cat("cat-b"))
  val dogs=List(Dog("dog-a"),Dog("dog-b"))
  //List[+A] 协变的
  def printAnimals(elems:List[Animal]):Unit={
    elems.foreach(e=>{
      println(e)
    })
  }
  printAnimals(cats)
  printAnimals(dogs)
  //--------------------------
  //逆变
  trait AnimalPrinter[-A]{
    def print(obj:A):Unit
  }

   class CatPrinter extends AnimalPrinter[Cat]{
     override def print(obj: Cat): Unit = {
      println("cat print")
    }
  }

  class AnimalPrinter2 extends AnimalPrinter[Animal]{
    override def  print(obj: Animal): Unit = {
      println("animal print")
    }
  }

  val cat=Cat("cat-b")
  def doAnimalPrinter(cat:Cat):Unit={
    val animal1Print=new AnimalPrinter2
    val catPrint=new CatPrinter
    animal1Print.print(cat)
    catPrint.print(cat)
  }
  doAnimalPrinter(cat)

  //--------------------------
  //不变忽略
}
