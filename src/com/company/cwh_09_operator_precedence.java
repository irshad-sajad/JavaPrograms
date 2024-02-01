package com.company;

public class cwh_09_operator_precedence {
    public static void main(String[] args) {
        //Precedence & Associativity
        //int a = 6*5-34/2;
        /*
        highest precedence goes to * & / so they are evaluated first,
        on the basis of left to right associativity.
           =30-34/2
           =30-17
           =13
         */

        //int b = 60/5-34*2;
        /*
           =12-34*2
           =12-68
           =-56
         */
//        System.out.println(a);
//        System.out.println(b);

        //Quick Quiz
//        int x = 6;
//        int y = 1;
//        int k = x*y/2;

        int b = 1;
        int c = 4;
        int a = 5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
