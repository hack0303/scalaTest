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
      case _ =>println("_")//Ĭ��������������������
    } 
  })
  /**
   * for����
   * */
  for((a,b)<-tups){
    println((a,b))
  }
  /**
   * �ܽ�:
   * ����switch���﷨��ֻ�ǲ��������˶��󣬶���ÿ��case���Զ�����break
   * 
   * */
  
}