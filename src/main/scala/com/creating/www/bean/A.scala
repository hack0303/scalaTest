package com.creating.www.bean

class A {
  private var _x=0
  private var _y=0
  def x=_x
  def y=_y
  def x_=(x:Int):Unit={
    _x=x
  }
  def y_=(y:Int):Unit={
    _y=y
  }
}