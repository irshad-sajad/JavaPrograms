package com.company;

import java.util.Scanner;

public class cwh_25_ps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1:
//        int n=4;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Q2:
        //print sum of n numbers using while loop
//        int n=3;
//        int sum=0;
//        int i = 0;
//        while (i < n) {
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println(sum);

        //Q3:
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(n*i);
//        }

        //Q4:
//        int n = 10;
//        for (int i = n; i > 0; i--) {
//            System.out.println(n*i);
//        }

        //Q5:
//        int n = sc.nextInt();
//        int fact=1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact*i;
//        }
//        System.out.println(fact);

        //Q6:
//        int n = sc.nextInt();
//        int fact=1;
//        int i=1;
//        while (i <= n) {
//            fact = fact*i;
//            i++;
//        }
//        System.out.println(fact);

        //Q7:
//        int n = sc.nextInt();
//        int i = n;
//        while (i > 0) {
//            int j = 0;
//            while (j < i) {
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.println();
//        }

        //Q8:
//        int n = 8;
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + (n*i);
//        }
//        System.out.println(sum);

        //Q10:
        int n=3;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.println(sum);
    }
}
