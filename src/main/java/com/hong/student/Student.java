package com.hong.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
       this.name = name;
       this.english = english;
       this.math = math;
       }

    public void print() { //void不回傳任何型態，一呼叫就出來
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + (english + math) /2 );
    }
}
