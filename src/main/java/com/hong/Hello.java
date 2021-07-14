package com.hong;

public class Hello{
    public static void main(String[] args) {
//        System.out.println("Hello!!");
//        new Person().Hello();  //呼叫Person類別裡的Hello功能
        Person p = new Person(/*ctrl+p*/"hong", 66.5f, 1.7f);
        p.Hello();
        /*p.weight = 66.5f;
        p.height = 1.7f;*/
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score >90);//字串比較 && || > >= < <=
        char c = 'A';//unicode編碼
        System.out.println(c > 'a');
/*
//        "數值"基本資料型態:int,short,long,float,double,byte
        int age = 19;
        Integer age2 = 19;
        age2.byteValue();
//        "字元"資料型態:char(字元),String(字串)
        char c = 'A';   //char c = '我';
        float weight = 66.5f; //java 浮點數預設使用64位元的double(精確度高?),加上"f"可用較窄的32位元放入
//        真假型態:boolean
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";
*/
    }
        }
