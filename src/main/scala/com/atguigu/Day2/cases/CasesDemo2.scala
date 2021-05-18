package com.atguigu.Day2.cases

import scala.util.Random

//模式匹配：按照参数类型匹配
object CasesDemo2 extends App {
  val arr = Array(1, 2.0, "hhh", CasesDemo2)
  val elem = arr(Random.nextInt(arr.length))
  println(elem)
  elem match {
    case x: Int => println("Int:" + x)
    case y: Double if y > 10.0 => println("Double:" + y)
    case z: String => println("String:" + z)
    case _ => println("no match exception")
  }
}
