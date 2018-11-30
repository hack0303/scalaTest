package com.creating.www.generic.clazz


object Tester extends App {
/**
 * the same to java's template
 * */
  class People[A]{
    private var animals:List[A]=Nil
    def createList():Unit={
      this.animals=List.empty[A]
    }
    def add(e:A)={
      this.animals=e :: this.animals
    }
    def getAnimals()={
      this.animals
    }
  }
  case class Animal(name:String,age:Int)
  
  val people:People[Animal]=new People[Animal]
  people.add(Animal("a",11))
  people.add(Animal("b",11))
  people.add(Animal("c",11))
  people.add(Animal("d",11))
  people.getAnimals().foreach(e=>{
    println(s"${e.name} ${e.age}")
  })
}