package org.example;

public class Student {

    private int age;

    private int rno;

    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno = rno;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0) this.age = age;
        else this.age=0;
    }

//    public Student(){
//        System.out.println("Student created");
//    }

    public void show(){
        System.out.println("Show Method");
    }
}
