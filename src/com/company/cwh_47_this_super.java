package com.company;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int b){
        super(b);
        System.out.println("I am a constructor");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
        DoClass d = new DoClass(7);
    }
}


/* this is a reference variable that refers to the current object in a method or constructor.
The most common use of 'this' keyword is to eliminate the confusion between class attributes and parameters with the same name. */