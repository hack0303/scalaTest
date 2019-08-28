package com.creating.www.bean
import com.creating.www.bean.traits.traitA

class Extend0 extends traitA{
  override def operate1:Unit={
    println("operate001")
  }
  override def operate2:Int={
    1
  }
}