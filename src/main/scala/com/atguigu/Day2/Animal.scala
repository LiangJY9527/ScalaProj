package com.atguigu.Day2
//相当于java中的接口
trait Animal {
  //和java中的接口类似，可以实现也可以不实现
  def run(): Unit ={
    println("animal")
  }
}
