package com.creating.www.bean

package object fruits {
    val lst=List[Fruit](Apple,Orange,Banana)
    def showFruits:Unit={
      for(x<-lst){
       x.show
      }
    }
}