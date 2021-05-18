package com.atguigu.Day2

//scala单例设计模式
object SingletonDemo {
  def main(args: Array[String]): Unit = {

    val s = SingletonDemo
    println(s)
    val s1 = SingletonDemo
    println(s1)
  }
}
