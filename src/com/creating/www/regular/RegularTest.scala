package com.creating.www.regular

import scala.util.matching.Regex
object RegularTest extends App {
  val reg:Regex="[0-9a-zA-Z ()#.:$]".r
  /**
   * example001
   * RESULT:
   * (Some(0),Some(a),Some(A),Some( ),Some(#))
   * */
  println(reg.findFirstMatchIn("0123"),reg.findFirstMatchIn("abc"),reg.findFirstMatchIn("ABC"),reg.findFirstMatchIn(" >"),reg.findFirstMatchIn("#<>"))
  val numberReg:Regex="[0-9]".r
  numberReg.findFirstMatchIn("abc123dce") match {
    case Some(x) if x.toString()=="1" =>{
      println(s"find ${x}")
    }
    case None=>{
      println("not find")
    }
    case _=> println("????????")
  }
  /**
   * example002
   * 
   * */
  val source="""
background-color: #A03300;
    |background-image: url(img/header100.png);
    |background-position: top center;
    |background-repeat: repeat-x;
    |background-size: 2160px 108px;
    |margin: 0;
    |height: 108px;
    |width: 100%;
""".stripMargin
val groupReg="([0-9a-z-]+): ([0-9a-zA-Z-/#%(). ]+);".r
groupReg.findAllMatchIn(source).foreach((aSource)=>{
  println(s"key:${aSource.group(1)},value:${aSource.group(2)}")
  
})
}