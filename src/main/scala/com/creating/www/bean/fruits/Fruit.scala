package com.creating.www.bean.fruits

case class Fruit(name:String,weight:Integer) {
  def show:Unit=println(s"${name}'s weight are ${weight}")
}
object Apple extends Fruit("Apple",10)
object Orange extends Fruit("orage",10)
object Banana extends Fruit("banana",10)
case class SubFruit(name:String){
  def show:Unit=println(s"${name}")
}