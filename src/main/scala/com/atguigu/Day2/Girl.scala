package com.atguigu.Day2

import scala.io.Source

class Girl {
  //在new的时候，主构造器里面的内容都会被执行
  val id = "123"
  println(id)
  //读取文件,并转化为字符串
  try {
    val fileStr = Source.fromFile("").mkString
    println(fileStr)
  } catch {
    case e: Exception => e.printStackTrace()
  } finally {
    println("finally")
  }
}
object Girl{
  def main(args: Array[String]): Unit = {
    val girl = new Girl()
  }
}
