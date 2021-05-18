package com.atguigu.Day2
//主构造器
class Cat(val id: String) {
  var name: String = _

  //辅助构造器
  def this(id: String, name: String) {
    this(id)
    this.name = name
  }
}
object Cat{
  def main(args: Array[String]): Unit = {
    val cat = new Cat("aaa","bbb")
    println(cat.name)
  }
}
