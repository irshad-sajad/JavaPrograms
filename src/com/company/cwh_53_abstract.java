package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am a Parent constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    //abstract method
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good morning");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        //Parent p = new Parent(); --> error
        Child c = new Child();
        //Child2 c2 = new Child2(); --> error
    }
}
