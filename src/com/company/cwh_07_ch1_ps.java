package com.company;

import java.util.Scanner;

public class cwh_07_ch1_ps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Question1
//        int a = 4;
//        int b = 5;
//        int c = 3;
//        int sum = a+b+c;
//        System.out.println(sum);

        //Question2
        //method-1: type casting int to float
//        int subject1 = 45;
//        int subject2 = 50;
//        int subject3 = 85;
//        float cgpa = (float) (subject1+subject2+subject3)/30;

        //using float as datatype
//        float subject1 = 45;
//        float subject2 = 67;
//        float subject3 = 86;
//        float cgpa = (subject1+subject2+subject3)/30;
//        System.out.println(cgpa);

        //Question3
//        System.out.println("what's your name:");
//        String name = sc.next();
//
//        //greeting
//        System.out.println("hello "+name+", have a good day!");


        //Question4
//        System.out.println("enter number of kilometers:");
//        double km = sc.nextDouble();
//
//        double miles = 0.621371*km;
//        System.out.println(miles+" miles");


        //Question5
        System.out.println("enter a number:");
        boolean num = sc.hasNextInt();

        System.out.println(num);

    }

}
