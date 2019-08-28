package com.creating.www.bean.fruits
import com.creating.www.bean.fruits._
object FruitTest { 
  def main(args:Array[String]):Unit={
    Apple.show
    //println(s"hello") 
    import com.creating.www.bean.fruits.SubFruit
    var obj=SubFruit("some")
    obj.show
    showFruits
  }
}