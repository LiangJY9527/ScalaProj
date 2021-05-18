package com.atguigu.Day2.cases

import scala.util.Random
//模式匹配：按照参数内容匹配
object CasesDemo1 extends App {
  val arr = Array("yasuo","tianshi","kate")
  val name = arr(Random.nextInt(arr.length))

  name match{
    case "yasuo" => println("hasagei")
    case "tianshi" => println("shenpan")
    case _ => println("shenmegui")
  }
}
