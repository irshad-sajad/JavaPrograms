package com.company;

import java.util.Scanner;

public class cwh_21_ch5_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while loop
//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finish running while loop");

        //Quiz:
//        int i=100;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }

        //do-while loop
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);

        //Quiz:
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=n);

        //for loop
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

        //Quiz:
        // 2n = even numbers -> 0,2,4,6,8
        // 2n+1 = odd numbers -> 1,3,5,7,9
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println(2*i+1);
//        }

        //decrementing numbers
//        for(int i=5;i!=0;i--){
//            System.out.println(i);
//        }

        //Quiz:
        //print first n natural numbers in reverse order
        int n = sc.nextInt();
        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
