package com.atguigu.Day2
//主构造器：不加val或者var的只可以在本类中访问，相当于private[this]
class People(val id: String,var name: String,sex :String,val age: Int = 24) {

}
object People{
  val p = new People("123","abc","男",25)
  println(p.id)
  println(p.name)
  println(p.age)
  p.name = "def"
}

