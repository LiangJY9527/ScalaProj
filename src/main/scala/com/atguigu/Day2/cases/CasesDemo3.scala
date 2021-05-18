package com.atguigu.Day2.cases

object CasesDemo3 extends App {
  //样式匹配：数组匹配
//  val arr = Array(0,1,5)
//  val arr = Array(0,5)
/*  val arr = Array(0,1,5,68)
  arr match {
    case Array(0,x,y) => println(s"size=3 x=$x y=$y")
    case Array(x,y) =>println(s"size=2 x=$x y=$y")
    case Array(0,z,_*) => println(z)
  }*/

  //样式匹配：List匹配
//  val list = List(1)
//  val list = List(3,5)
/*  val list = List(1,2,3,5)
  //Nil：代表空的list
  list match {
    case 1::Nil => println("1")
    case x::y::Nil =>println(s"x=$x y=$y")
    case 1::z => println(z)
    case _ => println("no match")
  }*/

  //样式匹配：元组匹配
//  val tup = (1,3,5)
  val tup = (6,3,5)
  tup match {
    case (1,x,y) => println("1")
    case (_,z,5) => println(z)
    case _ => println("no")
  }
}

