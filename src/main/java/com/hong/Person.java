package com.hong;

public class Person {
    String name;  //屬性
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
//多載:可以寫多個相同建構子overloading的名稱，只要裡面的個數、型態不同
//ctrl+p 可查看
    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
        /*this.weight = weight;
        this.height = height;*/ //重複的呼叫可改成 this(weight, height);
    }
    public float bmi() { //bmi的資料型態是float
        float bmi = weight / (height * height);
        return bmi; //回傳一個浮點數值
    }

    public void Hello() {
        System.out.println("HelloWorld");
    }
}
