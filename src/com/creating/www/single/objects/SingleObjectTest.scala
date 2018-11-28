package com.creating.www.single.objects

object SingleObjectTest extends App {
  case class A(str:String){
    import AA._
    def v:String=AA.value(str)
    def _info():Unit={
      AA.info(str)
    }
    def info_copy:(String)=>Unit=AA.info
  }
  object AA{
    def info(param:String):Unit={
      println(s"[INFO] ${param}")
    }
     def value(param:String):String={
      param
    }
  }
  AA.info("hehe")
  println(A("haha").v)
  A("haha")._info()
  A("haha").info_copy("haha_copy")
  /**
   * ½á¹û
   *[INFO] hehe
   *haha
   *[INFO] haha
   *[INFO] haha_copy
   * */
  
  /**
   * same to JAVA static,transform to JAVA class ,will automic add static method in A Class 
   * */
}