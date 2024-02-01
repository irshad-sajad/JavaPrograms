package com.company;

import java.util.Scanner;

public class cwh_05_taking_input {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter number 1:");
//        int n1 = sc.nextInt();
//        float n1 = sc.nextFloat();
//        System.out.println("enter number 2:");
//        int n2 = sc.nextInt();
//        float n2 = sc.nextFloat();

//        int sum = n1+n2;
//        float sum = n1+n2;
//        System.out.println("sum = "+sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String str = sc.next(); //will read/return only one word.
//        String str = sc.nextLine(); //will read/return whole string.
//        System.out.println(str);



        //practice question:

        //take marks as input from students
        System.out.println("enter marks of 5 subjects(out of 100):");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        //take total marks of exam
        System.out.println("enter the total marks of this exam:");
        int totalMarks = sc.nextInt();

        //calculate percentage
        float sum = (s1+s2+s3+s4+s5);
        float percentage = (sum/totalMarks)*100;
        System.out.println("your %age is: "+ percentage);
    }
}
