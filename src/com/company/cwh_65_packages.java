package com.company;

import java.util.Scanner;  //imports String from java.util
//import java.util.*;  //imports everything from java.util
public class cwh_65_packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //java.util.Scanner sc = new java.util.Scanner(System.in); //use without importing
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as: "+a);
    }
}
