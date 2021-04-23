package com.creating.www.COMPREHENSIONS

/**
 * yield syntax sugar 
 * 在 for 中yield 用来把后面的元素装到一个for 全局默认的list中 
 * */
object Test extends App {
  case class User(name:String,age:Int){
    
  }
  val x=User("a",1)
  val y=User("b",2)
  val z=User("c",3)
  val u=User("u",4)
  val userBeans=List.empty[User]
  val finalBeans=userBeans.::(x).::(y).::(z).::(u)
  val list=for(user <- finalBeans if (user.age >= 0 && user.age <= 3)) yield user.name
  list.foreach(e=>{
    println(e)
  })
}