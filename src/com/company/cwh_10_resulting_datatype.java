package com.company;

public class cwh_10_resulting_datatype {
    public static void main(String[] args) {

        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f+x;
        System.out.println(b); */

        //Increment and Decrement Operators
        int i = 56;
        int b = i++; //first b is assigned i then i is incremented
        int j = 67;
        int c = ++j; //first j is incremented then c is assigned j (68)
        System.out.println(i++); //57
        System.out.println(i); //58
        System.out.println(++i); //59
        System.out.println(++i); //60
        System.out.println(i); //60

        //Quick Quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char ch = 'b';
        ch++; // -> ch is now 'c'
        System.out.println(ch);
    }
}
