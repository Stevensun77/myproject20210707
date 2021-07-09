package com.hong

fun main() {
//    println("Hello kotlin!"); //kotlin結尾";"可加可不加
//    Human().hello()
//儲存物件可用val、var來定義，「val 代表定義完後不能再改變他的值」
    val h = Human() //用val建構Human物件
    h.hello()
}

//先設計類別，再設計方法
class Human {
    fun hello() {
        println("Hello kotlin!!")
    }
}