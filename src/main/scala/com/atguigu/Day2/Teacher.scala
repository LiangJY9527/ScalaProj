package com.atguigu.Day2
//继承一个类，实现多个接口
class Teacher extends Men with Animal {
  override def run(): Unit = {
    println("teacher")
  }
  //?
  val t1,t2,(a,b,c)={
    println("ABCD")
    (1,2,3)
  }
}

object Teacher {
  def main(args: Array[String]): Unit = {
    val t = new Teacher()
    println(t.t1)
    println(t.a)
  }
}
