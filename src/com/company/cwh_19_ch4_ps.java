package com.company;

import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1:
//        int a = 11;
//        if(a = 11){ //error
//            System.out.println("I am 11");
//        }else {
//            System.out.println("I am not 11");
//        }

        //Q2:
//        byte m1,m2,m3;
//        System.out.println("enter your marks in physics:");
//        m1 = sc.nextByte();
//        System.out.println("enter your marks in chemistry:");
//        m2 = sc.nextByte();
//        System.out.println("enter your marks in mathematics:");
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is: "+avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, you have been promoted!");
//        }else{
//            System.out.println("Sorry, you have not been promoted!");
//        }

        //Q3:
//        float tax = 0;
//        System.out.println("enter your income: ");
//        float income = sc.nextFloat();
//        if (income<=2.5f){
//            tax = tax+0;
//        }else if (income>2.5f && income<=5.0f){
//            tax = tax+0.05f*(income-2.5f);
//        }else if (income>5.0f && income<=10.0f){
//            tax = tax+0.05f*(income-2.5f);
//            tax = tax+0.2f*(income-5.0f);
//        }else if (income>10.0f){
//            tax = tax+0.05f*(income-2.5f);
//            tax = tax+0.2f*(income-5.0f);
//            tax = tax+0.3f*(income-10.0f);
//        }
//
//        System.out.println("the total tax paid by the employee is: "+tax);

        //Q4:
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Q5:
//        int year = sc.nextInt();
//
//        if (year%4==0){
//            System.out.println(year+" is a leap year!");
//        }else{
//            System.out.println(year+" is not a leap year!");
//        }

        //Q6:
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }else if (url.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }else if (url.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
}
