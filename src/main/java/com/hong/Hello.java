package com.hong;

public class Hello{
    public static void main(String[] args) {
//        System.out.println("Hello!!");
//        new Person().Hello();  //呼叫Person類別裡的Hello功能
        Person p = new Person();
        p.Hello();
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
    }
        }
