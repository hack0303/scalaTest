package com.creating.www.COMPREHENSIONS

/**
 * yield syntax sugar 
 * �� for ��yield �����Ѻ����Ԫ��װ��һ��for ȫ��Ĭ�ϵ�list�� 
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