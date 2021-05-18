package com.atguigu.Day2

//对象
//第一个private代表的是包的访问权限；第二个private代表的是私有的构造方法，只可以在半生对象中new对象
private[Day2] class Person private{
  val id = "9527"
  var name = "java"
  //只可以在这个文件访问
  private var age: Int = 16
  //只可以在这个类中访问
  private[this] var prop: String = _

  def printProp(): Unit = {
    println(s"prop = ${prop}")
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person()
    println(p.id + " " + p.name)
    p.name = "scala"
    println(p.id + " " + p.name)
    println(p.age)
    println(p.printProp())

  }
}
