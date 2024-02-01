package com.company;

public class cwh_32_method_overloading {
    static void change2(int[] arr){
        arr[0] = 90;
    }
    static void change(int a){
        a = 98;
    }

    static void foo(){
        System.out.println("good morning!");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" times");
    }
    static void foo(int a, int b){
        System.out.println("good morning "+a*b+" times");
    }
    static void foo(int a, int b, int c){
        System.out.println("good morning "+(a+b+c)+" times");
    }

    public static void main(String[] args) {
        // Case 1: Changing the Integer
        int x = 45;
        change(x); //pass by value - a copy this var is passed
        System.out.println("the value of x after running change is: "+x); //45

        // Case 2: Changing the Array
        int[] marks = {54,76,67,45,87};
        change2(marks); //pass by reference -> actual values are passed
        System.out.println("the value of x after running change is: "+marks[0]);

        //Method Overloading
        foo();
        foo(100);
        foo(5,10);
        foo(10,20,30);
        // arguments are actual!
    }
}
