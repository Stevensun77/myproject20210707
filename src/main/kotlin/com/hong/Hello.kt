package com.hong

fun main() {
//    println("Hello kotlin!"); //kotlin結尾";"可加可不加
//    Human().hello()
//儲存物件可用val、var來定義，「val 代表定義完後不能再改變他的值」
    val h = Human(weight = 66.5f, height = 1.7f) //用val建構Human物件
    println(h.bmi())
/*
//    一開始定義變數時，要用val(不可變動)或var(未來可變動)
//    val age = 19; //可不指定資料型態。如要指定 val age(名稱) : Int(型態) =  19(值);
    var age = 19;
    age = 20;
    var weight = 66.5; //預設是double型態，加"f"會轉變成float型態
    var name : String; //只定義未給值，不加String系統不知道name是什麼 //直接給值就是var name = "Hong";
    name = "Hong";
    */
}

//先設計類別，再設計方法
/*kotlin建構子分為主要建構子(primary constructor)
和次要建構子(secondary constructor)*/
class Human(var name : String = "", var weight : Float, var height : Float) { //var name : String = ""給定初始值，程式就可不一定要輸入

    init{ //init區塊會在建構子完成後自動執行
        println("test $weight")//kotlin中可用$號代表一個資料，可不用+號相加字串
    }
//    constructor(name: String, weight: Float, height: Float) : this(weight,height) //主建構子有用到的這裡要求用this呼叫
    //↑次要建構子
    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello kotlin!!")
    }
}