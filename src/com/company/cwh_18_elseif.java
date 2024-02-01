package com.company;

import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char var = 'r';

        switch (var) {
            case 'c' -> System.out.println("you are going to become an adult!");
            case 'r' -> System.out.println("you are going to join a company!");
            case 'd' -> System.out.println("you are going to get retired!");
            default -> System.out.println("enjoy your life!");
        }
        System.out.println("Thanks for using my switch case!");


        /*
        int age;
        age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced!");
        }else if (age>46){
            System.out.println("you are semi-experienced!");
        }else if (age>36){
            System.out.println("you are semi-semi-experienced!");
        }else{
            System.out.println("you are not experienced!");
        }
         */
    }
}
