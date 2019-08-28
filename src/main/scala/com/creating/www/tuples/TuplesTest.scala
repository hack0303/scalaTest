package com.creating.www.tuples

object TuplesTest extends App {
  //base
  var tuple2=(1,"asadasd"):Tuple2[Int,String]
  var tuple3=(1,"asasd",()=>{ println(1+1)}):Tuple3[Int,String,Any]
  println(tuple2._1,tuple2._2)
  var (index,value,func)=tuple3
  println(index,value,func)
  //forEach
  var tups=List((1,"a"),(2,"b"),(3,"c"),(4,"d"))
  tups.foreach(tuple=>{
    tuple match{
      case (1,value)=>{
        println(tuple,value)
      }
      case p if(p._1==1)=>{
        println(tuple)
      }
      case p if(p._2=="b")=>{
        println(tuple)
      }
      case _ =>println("_")//默认情况，即都不符合情况
    } 
  })
  /**
   * for遍历
   * */
  for((a,b)<-tups){
    println((a,b))
  }
  /**
   * 总结:
   * 类似switch的语法，只是操作换成了对象，而且每个case都自动加了break
   * 
   * */
  
}