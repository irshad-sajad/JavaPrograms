package com.company;

class A{
    public int a;
    public int harry(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        // Created an object of Class A
        A a = new A();
        a.meth2();

        // Created an object of Class B
        B b = new B();
        b.meth2();
    }
}
