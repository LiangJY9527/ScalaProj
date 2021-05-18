package com.atguigu.scalaDemo

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    //固定长度的数组
    val arr = new Array[Int](10);
    println(arr.toBuffer)
    //固定长度的数组
    val arr1 = Array(1, 2)
    println(arr1.toBuffer)

    //可变长度的数组缓冲
    val arr2 = ArrayBuffer(1, 2)
    println(arr2)
    //往数组追加一个
    arr2 += 3
    println(arr2)
    //往数组追加多个
    arr2 += (4, 5, 6)
    println(arr2)
    //往数组追加一个数组缓冲
    arr2 ++= ArrayBuffer(7, 8)
    println(arr2)
    //在角标为0的位置插入一个或多个数据
    arr2.insert(0, 9)
    println(arr2)
    //在角标为6的位置删除一个元素
    arr2.remove(6, 1)
    println(arr2)

    //定义一个可以变的map
    val map = scala.collection.mutable.Map("a" -> 1, "b" -> 2)
    //    val map = scala.collection.mutable.Map(("a", 1),("b", 2))
    println(map.toBuffer)
    map("a") = 3
    println(map.toBuffer)
    map("c") = 4
    println(map.toBuffer)
    map += ("d" -> 5)
    println(map.toBuffer)
    map.getOrElse("f", 0)

    //定义一个元组，元组的角标从1开始
    val t = (1, "abc", "adc", 4)
    println(t._3)

    //拉链操作,zip:可以将多个值绑定到一起
    val f = Array("a", "b", "c")
    val g = Array(1, 2, 3, 4)
    val h = f.zip(g)
    println(h.toBuffer)
    println(g.reduce(_+_))

    //List:
    //不可变list
    val list = List(1, 2, 3, 4)
    println(list)
    //往list前面添加一个新元素，并返回一个新的list
    //    val list2 = 0 :: list
    //    val list2 = list.::(0)
    //    val list2 = 0 +: list
    //    val list2 = list.+:(0)
    //往list后面添加一个新元素，并返回一个新的list
    //    val list2 = list :+ (0)
    val list2 = list.:+(0)
    println(list2)

    //可变List
    val lsb = ListBuffer(1, 2, 3, 4)
    lsb(0) = 0
    println(lsb)
    val lsb1 = ListBuffer(5, 6)
    //往可变集合里添加元素
    lsb1 += 7
    println(lsb1)
    //往可变集合里添加新集合
    lsb ++= lsb1
    println(lsb)
    //把两个集合元素相加，返回一个新集合
    val lsb2 = list ++ lsb1
    println(lsb2)

    //Set

    //Map



    //单机版wordcount
    val words = List("hello scala haha hadoop", "hello kemi sleep zookeeper haha")
    //flatten：可以将集合套集合，转变为一个集合
    //    val red = words.map(_.split(" ")).flatten
    //flatMap相当于先map，再flatten
    val grouped = words.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1)
    println(grouped)
    //mapValues：只操作对偶元组中的value
    //foldLeft()()：第一个括号可以传一个默认值，后面的括号第一个_代表默认值或者上一次计算累加的结果，第二个_表示对偶元组的value
    val result = grouped.mapValues(_.foldLeft(0)(_+_._2))
    println(result)
    //先切割，在压平，在将结果转化为（word，1），再根据word分组，在将结果转化为（word，count），在转化为list并排序
    val red = words.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(x => (x._1, x._2.size)).toList.sortBy(_._2).reverse
    println(red)
  }

}
