package com.company;

public class cwh_31_methods {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // calling a method by creating an obj of the class in which method exists followed by method call
//        cwh_31_methods obj = new cwh_31_methods();
//        int c = obj.sum(a,b); // we do not need static keyword if we are doing this way
        int c = sum(a,b);
        System.out.println(c);
        System.out.println(a+" "+b);
    }

    // static method se static method bina object create kiye call kr skte hai
    static int sum(int x, int y){
        int z = x+y;
        return z;
    }
}
