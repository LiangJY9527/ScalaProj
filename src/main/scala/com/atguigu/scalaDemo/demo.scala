package com.atguigu.scalaDemo

object demo {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    val x = 1;
    val y = if (x > 0) x else -1
    println(y)
    for (i <- 1 to 5) {
      println(i)
    }
    val arr = Array("1", "2", "3")
    for (a <- arr) {
      println(a)
    }

    val t = for (a <- arr) yield a + 2
    println(t.toBuffer)

    //    yield :会生成一个新的数组或集合，取决于前面的参数的类型
    val f = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val f1 = for (i <- f; if i % 2 == 0) yield i
    println(f1.toBuffer)
    //这里的下划线相当于占位符，还可以将方法转变为函数
    val f2 = f.filter(_ % 2 == 0)
    println(f2.toBuffer)

    val f3 = f.map(x => x+5)
    println(f3.toBuffer)

    val a = m1(func)
    println(a)
  }

  //def定义方法，格式: def 方法名(方法参数): 返回值类型 = {方法体}
  def m1(f: Int => Int): Int = {
    f(3)
  }
  //定义函数一：(函数的参数) => {函数体}
  val func = (x: Int) => {
    x * 10
  }
  //定义函数二：函数名: （函数的入参类型,...） => （函数的出参类型,...）= {（函数入参的引用变量,...） => 函数体}
  val func2: Int => String ={
    x => x.toString
  }
}
