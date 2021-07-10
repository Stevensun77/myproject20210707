package com.hong

fun main() {
//    println("Hello kotlin!"); //kotlin結尾";"可加可不加
//    Human().hello()
//儲存物件可用val、var來定義，「val 代表定義完後不能再改變他的值」
    val h = Human() //用val建構Human物件
    h.hello()
//    一開始定義變數時，要用val(不可變動)或var(未來可變動)
//    val age = 19; //可不指定資料型態。如要指定 val age(名稱) : Int(型態) =  19(值);
    var age = 19;
    age = 20;
    var weight = 66.5; //預設是double型態，加"f"會轉變成float型態
    var name : String; //只定義未給值，不加String系統不知道name是什麼 //直接給值就是var name = "Hong";
    name = "Hong";
}

//先設計類別，再設計方法
class Human {
    fun hello() {
        println("Hello kotlin!!")
    }
}