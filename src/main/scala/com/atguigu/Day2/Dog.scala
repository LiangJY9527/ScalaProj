package com.atguigu.Day2
//类
class Dog {

}
//伴生对象
object Dog{
  /*def apply():Unit ={
    println("apply")
  }*/
  def apply(): Dog = new Dog()

  def apply(name:String): Unit = {
    println(name)
  }
  def main(args: Array[String]): Unit = {
    //单例对象
    val d = Dog
    //默认会调用伴生对象中的apply方法
    val f = Dog()
  }
}